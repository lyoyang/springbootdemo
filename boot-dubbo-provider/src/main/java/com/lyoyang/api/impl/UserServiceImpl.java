package com.lyoyang.api.impl;

import com.lyoyang.api.UserService;
import com.lyoyang.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserServiceImpl implements UserService {

    @Override
    @HystrixCommand
    public User getUserInfoById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("test:" + id);
        user.setEmail("test@" + id + ".com");
        if(Math.random() > 0.5) {
            throw new RuntimeException();
        }
        return user;
    }
}
