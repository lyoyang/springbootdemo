package com.lyoyang.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class RedisService {
    private static final int DEFAULT_EXPIRE_SECONDS = 10*60;

    @Autowired
    private RedisTemplate redisTemplate;

    public void putObject(String key, String subKey, Serializable serializable) {
        putObject(key, subKey, serializable, DEFAULT_EXPIRE_SECONDS);
    }

    /**
     * 向缓存增加一个对象存储
     *
     * @param key           key
     * @param subKey        subKey
     * @param expireSeconds (针对key的)过期时间，单位秒
     */
    public void putObject(String key, String subKey, Serializable serializable, long expireSeconds) {
        redisTemplate.opsForHash().put(key, subKey, serializable);
        redisTemplate.expire(key, expireSeconds, TimeUnit.SECONDS);
    }



    /**
     * 根据key和subKey获取一个对象
     */
    public Object getObject(String key, String subKey) {
        Object obj = null;
        if (redisTemplate.opsForHash().hasKey(key, subKey))
            obj = redisTemplate.opsForHash().get(key, subKey);
        return obj;
    }

    /**
     * 根据key获取多个subkey对象的list
     *
     * @param key
     * @return
     */
    public List<Object> getObjects(String key) {
        List<Object> objs = null;
        if (redisTemplate.hasKey(key)) {
            List<Object> ret = new ArrayList<Object>();
            for (Object obj : redisTemplate.opsForHash().values(key)) {
                ret.add(obj);
            }
            objs = ret;
        }
        return objs;
    }

    /**
     * 根据key获取对应的对象个数
     *
     * @param key
     * @return
     */
    public Long size(String key) {
        Long l = 0L;
        if (redisTemplate.hasKey(key))
            l = redisTemplate.opsForHash().size(key);
        return l;
    }

    /**
     * 获取并删除
     *
     * @param key
     * @return
     */
    public Serializable getAndRemove(String key) {
        Serializable serializable = null;
        if (redisTemplate.opsForHash().hasKey(key, "")) {
            serializable = (Serializable) redisTemplate.opsForHash().get(key, "");
            redisTemplate.delete(key);
        }
        return serializable;

    }

    public Serializable getAndRemove(String key, String subKey) {
        Serializable object = null;
        if (redisTemplate.opsForHash().hasKey(key, subKey)) {
            object = (Serializable) redisTemplate.opsForHash().get(key, subKey);
            redisTemplate.opsForHash().delete(key, subKey);
        }
        return object;
    }

    public Serializable get(String key, String subKey) {
        if (redisTemplate.opsForHash().hasKey(key, subKey)) {
            return (Serializable) redisTemplate.opsForHash().get(key, subKey);
        }
        return null;
    }


    public void remove(String key) {
        redisTemplate.delete(key);
    }

    public void remove(String key, String subKey) {
        redisTemplate.opsForHash().delete(key, subKey);
    }


    public long increment(String key, String subKey, long increment) {
        return redisTemplate.opsForHash().increment(key, subKey, increment);
    }

    public Object getObject(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    public boolean tryPutObject(String key, Object value, long timeout) {
        return redisTemplate.opsForValue().setIfAbsent(key, value, Duration.ofMinutes(timeout));
    }

    public void putObject(String key, Object value, long timeout) {
        redisTemplate.opsForValue().set(key, value, Duration.ofSeconds(timeout));
    }


    public boolean hasKey(String key) {
        return redisTemplate.hasKey(key);
    }



}
