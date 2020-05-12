package com.lyoyang.rabbitmq.controller;

import com.lyoyang.rabbitmq.Utils.RabbitMQUtil;
import com.lyoyang.rabbitmq.bean.User;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


//    @Autowired
//    private RabbitTemplate rabbitTemplate;

    @Autowired
    private RabbitMQUtil rabbitMQUtil;

    @RequestMapping("/saveUser")
    public String saveUser() {
        User user = new User();
        user.setId(12);
        user.setGender("male");
        user.setUsername("jim");
//        rabbitTemplate.convertAndSend("exchange.userInfo", "userinfo", user);
        String exchange = "exchange.userInfo";
        String routeKey = "userinfo";
        rabbitMQUtil.sendObject(exchange, routeKey, user);
        return "success";
    }

    @RequestMapping("/sendMsg")
    public String sendMsg() {
        String msg = "hello china";
        rabbitMQUtil.sendMessage(msg, "atguigu", "exchange.fanout");
        return "hello china";
    }



}
