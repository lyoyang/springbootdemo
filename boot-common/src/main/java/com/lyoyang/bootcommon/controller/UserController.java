package com.lyoyang.bootcommon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    public String saveUser() {
        return "success";
    }

}
