package com.lyoyang.springbootlianshou.controller;


import com.lyoyang.springbootlianshou.entities.User;
import com.lyoyang.springbootlianshou.exception.UserNotExistException;
import com.lyoyang.springbootlianshou.mapper.UserMapper;
import com.lyoyang.springbootlianshou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(String username) {
//        if("aaaa".equals(username)){
//            throw new UserNotExistException();
//        }
        long startTime = System.currentTimeMillis();
        User user = new User();
//        for(int i = 1; i<=10000; i++ ) {
            user.setName("jim");
            user.setBirthday("2019-06-23");
            userMapper.insertSelective(user);
//        }
        System.out.println("花费时间：" + (System.currentTimeMillis() - startTime));
        return username;
    }

    @RequestMapping("/say")
    public String say() {
        userService.updateState();
        return "hello";
    }
}
