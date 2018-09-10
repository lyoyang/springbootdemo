package com.lyoyang.springbootredis.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lyoyang.springbootredis.dao.UserMapper;
import com.lyoyang.springbootredis.entity.User;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class RedisService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

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

}
