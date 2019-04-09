package com.lyoyang.springbootredis.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lyoyang.springbootredis.dao.UserMapper;
import com.lyoyang.springbootredis.entity.User;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCommands;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
public class RedisService {

    private ThreadLocal<String> lockFlag = new ThreadLocal<String>();
    public static final String UNLOCK_LUA;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("if redis.call(\"get\",KEYS[1]) == ARGV[1] ");
        sb.append("then ");
        sb.append("    return redis.call(\"del\",KEYS[1]) ");
        sb.append("else ");
        sb.append("    return 0 ");
        sb.append("end ");
        UNLOCK_LUA = sb.toString();
    }

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Cacheable(value = "user", key = "'User:'+#id")
    public User getUserById(Integer id) {
        return userMapper.getById(id);
    }

    public void saveUser(User user) {
        userMapper.saveUser(user);
    }

    public void add(String key, User user, Long time) {
        Gson gson = new Gson();
        stringRedisTemplate.opsForValue().set(key,gson.toJson(user),time, TimeUnit.MINUTES);
    }
    public void add(String key, List<User> users, Long time) {
        Gson gson = new Gson();
        String value = gson.toJson(users);
        stringRedisTemplate.opsForValue().set(key,value,32424L,TimeUnit.MINUTES);
    }
    public List<User> getUserList(String key) {
        String source = stringRedisTemplate.opsForValue().get(key);
        if(!StringUtils.isEmpty(source)){
            return new Gson().fromJson(source, new TypeToken<List<User>>(){}.getType());
        }
        return null;
    }

    public User getUser(String key) {
        String source = stringRedisTemplate.opsForValue().get(key);
        if(StringUtils.isNotEmpty(source)) {
            return new Gson().fromJson(source, User.class);
        }
        return null;
    }

    public void delete(String key) {
        stringRedisTemplate.opsForValue().getOperations().delete(key);
    }

    /**
     *
     * @param key
     * @param expire
     * @param retryTimes
     * @param sleepMillis
     * @return
     */
    public boolean lock(String key, long expire, int retryTimes, long sleepMillis) {
        boolean result = setRedis(key, expire);
        // 如果获取锁失败，按照传入的重试次数进行重试
        while((!result) && retryTimes-- > 0){
            try {
                Thread.sleep(sleepMillis);
            } catch (InterruptedException e) {
                return false;
            }
            result = setRedis(key, expire);
        }
        return result;
    }

    public boolean releaseLock(String key) {
        // 释放锁的时候，有可能因为持锁之后方法执行时间大于锁的有效期，此时有可能已经被另外一个线程持有锁，所以不能直接删除
        final List<String> keys = new ArrayList<String>();
        keys.add(key);
        final List<String> args = new ArrayList<String>();
        args.add(lockFlag.get());

        // 使用lua脚本删除redis中匹配value的key，可以避免由于方法执行时间过长而redis锁自动过期失效的时候误删其他线程的锁
        // spring自带的执行脚本方法中，集群模式直接抛出不支持执行脚本的异常，所以只能拿到原redis的connection来执行脚本
        Long result = (Long) redisTemplate.execute(new RedisCallback<Long>() {
            public Long doInRedis(RedisConnection connection) throws DataAccessException {
                Object nativeConnection = connection.getNativeConnection();
                // 单机模式
                return (Long) ((Jedis) nativeConnection).eval(UNLOCK_LUA, keys, args);
            }
        });
        return result != null && result > 0;
    }


    private boolean setRedis(final String key, final long expire) {
        String result = (String) redisTemplate.execute(new RedisCallback<String>() {
            @Override
            public String doInRedis(RedisConnection connection) throws DataAccessException {
                JedisCommands commands = (JedisCommands) connection.getNativeConnection();
                String uuid = UUID.randomUUID().toString();
                lockFlag.set(uuid);
                return commands.set(key, uuid, "NX", "PX", expire);
            }
        });
        return !StringUtils.isEmpty(result);
    }
}
