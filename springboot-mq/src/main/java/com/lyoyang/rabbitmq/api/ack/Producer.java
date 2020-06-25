package com.lyoyang.rabbitmq.api.ack;

import com.lyoyang.rabbitmq.api.BasicUtil;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.util.HashMap;
import java.util.Map;

public class Producer {

    public static void main(String[] args) throws Exception {
        Connection connection = BasicUtil.getConnection();
        Channel channel = connection.createChannel();
        String exchangeName = "test_confirm_exchange";
        String routingKey = "confirm.abcd";
        for (int i=0; i < 5; i++) {
            Map<String, Object> headers = new HashMap<>();
            headers.put("num", i);
            AMQP.BasicProperties properties = new AMQP.BasicProperties.Builder()
                    .deliveryMode(2)
                    .contentEncoding("UTF-8")
                    .headers(headers).build();
            String msg = "this is a confirm test " + i;
            channel.basicPublish(exchangeName, routingKey, properties, msg.getBytes());
        }
    }

}
