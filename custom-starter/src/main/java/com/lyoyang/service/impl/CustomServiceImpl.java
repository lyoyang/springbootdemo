package com.lyoyang.service.impl;

import com.lyoyang.service.CustomService;
import org.springframework.stereotype.Component;

@Component
public class CustomServiceImpl implements CustomService {

    @Override
    public String sayHello() {
        return "hello,this is starter test";
    }
}
