package com.lyoyang.rabbitmq.service;


import com.lyoyang.rabbitmq.bean.User;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @RabbitListener(queues = "lyoyang.userinfo")
    public void getUserInfo(User user) {
        System.out.println("收到消息：" + user);
    }


    @RabbitListener(queues = "atguigu")
    public void getMsg(Message message) {
        System.out.println(message.getBody().toString() + "received");
    }




}
