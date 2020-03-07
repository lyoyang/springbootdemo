package com.lyoyang.springsecurity.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController {


    @RequestMapping("/login/oauth2/code/github")
    public  String callback(HttpServletRequest request) {
        String msg = "hello";
        return "HELLO";
    }


}
