package com.lyoyang.rabbitmq.Utils;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQUtil {

//    @Autowired
//    private RabbitAdmin rabbitAdmin;

    @Autowired
    private RabbitTemplate rabbitTemplate;


    public  void sendMessage(String message) {
        Message msg = new Message(message.getBytes(),new MessageProperties());
        rabbitTemplate.send(msg);
    }

    public void sendMessage(String message, String routeKey) {
        Message msg = new Message(message.getBytes(),new MessageProperties());
        rabbitTemplate.send(routeKey, msg);
    }
    public void sendMessage(String message, String routeKey, String exchange) {
        Message msg = new Message(message.getBytes(),new MessageProperties());
        rabbitTemplate.send(exchange, routeKey, msg);
    }

    public void sendObject(Object object) {
        rabbitTemplate.convertAndSend(object);
    }
    public void sendObject(String routeKey,Object object) {
        rabbitTemplate.convertAndSend(routeKey, object);
    }

    public void sendObject(String exchange, String routeKey, Object object) {
        rabbitTemplate.convertAndSend(exchange, routeKey, object);
    }

}
