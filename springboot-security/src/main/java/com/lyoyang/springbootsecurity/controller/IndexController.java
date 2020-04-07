package com.lyoyang.springbootsecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "this is a index page";
    }


    @RequestMapping("/hello")
    public String hello() {
        return "hello security";
    }



}
