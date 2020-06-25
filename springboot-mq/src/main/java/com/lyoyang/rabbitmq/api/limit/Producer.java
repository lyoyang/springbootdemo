package com.lyoyang.rabbitmq.api.limit;

import com.lyoyang.rabbitmq.api.BasicUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class Producer {

    public static void main(String[] args) throws Exception {
        Connection connection = BasicUtil.getConnection();
        Channel channel = connection.createChannel();
        String exchangeName = "test_confirm_exchange";
        String routingKey = "confirm.abcd";
        for (int i=0; i < 5; i++) {
            String msg = "this is a limit test " + i;
            channel.basicPublish(exchangeName, routingKey, null, msg.getBytes());
        }
    }

}
