package com.lyoyang.controller;

import com.lyoyang.service.CustomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@RestController
public class IndexController {


    @Resource
    private CustomService customService;

    @GetMapping("/save")
    public String save() {
        customService.saveStudent();
        return "success";
    }


}
