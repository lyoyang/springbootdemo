package com.lyoyang.springbootstart.controller;

import com.alibaba.fastjson.JSONObject;
import com.lyoyang.springbootstart.properties.UserProperties;
import com.lyoyang.springbootstart.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
@Slf4j
@RefreshScope
public class UserController {


    @Resource
    private UserProperties userProperties;


    @RequestMapping("/getUserInfo")
    public String getUserInfo() {
        log.info("user:" + JSONObject.toJSONString(userProperties.getUserList()));
        return "hello jim";
    }


}
