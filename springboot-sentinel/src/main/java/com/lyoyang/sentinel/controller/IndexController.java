package com.lyoyang.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import com.lyoyang.sentinel.handler.SentinelBlockHandler;
import com.lyoyang.sentinel.handler.SentinelFallBackHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {


    @GetMapping("/")
    @SentinelResource(value = "index", fallbackClass = SentinelFallBackHandler.class, fallback = "fallback"
            , blockHandlerClass = SentinelBlockHandler.class, blockHandler = "block")
    public String index() {
        return "Index Page";
    }


    @GetMapping("/hello")
    @SentinelResource(value = "hello", fallbackClass = SentinelFallBackHandler.class, fallback = "fallback"
            , blockHandlerClass = SentinelBlockHandler.class, blockHandler = "block")
    public String hello() {
        return "Hello";
    }




}
