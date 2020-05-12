package com.lyoyang.springbootjpa.controller;

import com.lyoyang.springbootjpa.dao.UserDao;
import com.lyoyang.springbootjpa.entity.User;
import com.lyoyang.springbootjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserDao userDao;

    @RequestMapping("/getUserById")
    public User getUserById(Integer id) {
        return userDao.findById(id).get();
    }



}
