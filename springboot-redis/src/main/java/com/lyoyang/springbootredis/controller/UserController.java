package com.lyoyang.springbootredis.controller;

import com.lyoyang.springbootredis.entity.User;
import com.lyoyang.springbootredis.service.RedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private RedisService redisService;

    @RequestMapping("/getUserById")
    public User getUserById(Integer id){
        logger.error("错误日志测试记录哈哈哈哈哈哈");
        User user = redisService.getUserById(id);
        return user;
    }

    @RequestMapping("/saveUser")
    public String saveUser(User user) {
        redisService.saveUser(user);
        return "success";
    }

}
