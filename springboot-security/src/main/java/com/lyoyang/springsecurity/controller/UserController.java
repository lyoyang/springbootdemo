package com.lyoyang.springsecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/api")
public class UserController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello,user";
    }


}
