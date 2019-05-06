package com.lyoyang.controller;

import com.lyoyang.api.UserService;
import com.lyoyang.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference
    private UserService userService;

    @HystrixCommand(fallbackMethod = "defaultValue")
    @RequestMapping("/getUserById")
    public User getUserById(Integer id) {
        User user = userService.getUserInfoById(id);
        return user;
    }


}
