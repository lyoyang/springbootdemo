package com.lyoyang.rabbitmq.service;

import com.lyoyang.rabbitmq.bean.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @RabbitListener(queues = "atguigu")
    public void getUserInfo(User user) {
        System.out.println("收到消息：" + user);
    }



}
