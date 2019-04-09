package com.lyoyang.springbootstart.controller;

import com.lyoyang.springbootstart.entity.User;
import com.lyoyang.springbootstart.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


    private final Logger logger = LoggerFactory.getLogger(getClass());


    @Autowired
    private UserService userService;

    @RequestMapping("/createUser")
    public String createUser(String username, String password) {
        userService.createUser(username, password);
        return "success";
    }

    @RequestMapping("/getByName")
    public User getUserByName(String name) {
//        logger.info("######log start#######");
        User user = userService.getByName(name);
//        logger.info("########log end ########");
        return user;
    }

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


}
