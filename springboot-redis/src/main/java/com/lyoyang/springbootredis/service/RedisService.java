package com.lyoyang.springbootredis.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lyoyang.springbootredis.dao.UserMapper;
import com.lyoyang.springbootredis.entity.User;
import io.lettuce.core.RedisAsyncCommandsImpl;
import io.lettuce.core.RedisFuture;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCommands;
import redis.clients.jedis.Protocol;
import redis.clients.util.SafeEncoder;

import java.time.Duration;
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

    public void releaseLock(String key) {
        System.out.println(Thread.currentThread() + "释放锁");
        redisTemplate.delete(key);
    }


    private boolean setRedis(final String key, final long expire) {
        RedisCallback<Boolean> redisCallback = new RedisCallback<Boolean>() {
            @Override
            public Boolean doInRedis(RedisConnection redisConnection) throws DataAccessException {
                RedisSerializer valueSerializer = redisTemplate.getValueSerializer();
                RedisSerializer keySerializer = redisTemplate.getKeySerializer();
                String value = UUID.randomUUID().toString();
                Object obj = redisConnection.execute("set", keySerializer.serialize(key),
                        valueSerializer.serialize(value),
                        SafeEncoder.encode("NX"),
                        SafeEncoder.encode("EX"),
                        Protocol.toByteArray(expire));
                return obj != null;
            }
        };
        Boolean res = (Boolean) redisTemplate.execute(redisCallback);
        return res;
//        String result = (String) redisTemplate.execute(new RedisCallback<String>() {
//            @Override
//            public String doInRedis(RedisConnection connection) throws DataAccessException {
//                JedisCommands commands = (JedisCommands) connection.getNativeConnection();
//                String uuid = UUID.randomUUID().toString();
//                lockFlag.set(uuid);
//                return commands.set(key, uuid, "NX", "PX", expire);
//            }
//        });
//        return !StringUtils.isEmpty(result);
    }


    public boolean tryLock(Object key, Object value) {
        return redisTemplate.opsForValue().setIfAbsent(key, value, Duration.ofSeconds(20));
    }



}
