package com.lyoyang.bootcommon.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/index")
public class IndexController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello boot";
    }


}
