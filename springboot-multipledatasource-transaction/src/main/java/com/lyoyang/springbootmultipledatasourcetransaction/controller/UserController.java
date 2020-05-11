package com.lyoyang.springbootmultipledatasourcetransaction.controller;

import com.lyoyang.springbootmultipledatasourcetransaction.entity.User;
import com.lyoyang.springbootmultipledatasourcetransaction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;



    @RequestMapping("/saveUserByTest1")
    public String saveUserByTest1(User user) {
        userService.saveUserByTest1(user);
        return "success";
    }

    @RequestMapping("/saveUserByTest2")
    public String saveUserByTest2(User user) {
        userService.saveUserByTest2(user);
        return "success";
    }

    @RequestMapping("/saveUser")
    public String saveUser(User user) {
        userService.saveUser(user);
        return "success";
    }

    @RequestMapping("/getById")
    public User getById(Integer id) {
        return userService.getByIdFromTest1(id);
    }
}
