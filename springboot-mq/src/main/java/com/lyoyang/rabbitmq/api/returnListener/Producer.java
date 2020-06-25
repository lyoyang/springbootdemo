package com.lyoyang.rabbitmq.api.returnListener;

import com.lyoyang.rabbitmq.api.BasicUtil;
import com.rabbitmq.client.*;

import java.io.IOException;

public class Producer {

    public static void main(String[] args) throws Exception {
        Connection connection = BasicUtil.getConnection();
        Channel channel = connection.createChannel();
        String exchangeName = "test_confirm_exchange";
        String routingKey = "confirm.abcd";
        String routingKeyError = "errorKey";
        String msg = "this is a confirm test";
        channel.addReturnListener(new ReturnListener() {
            @Override
            public void handleReturn(int replyCode,
                                     String replyText,
                                     String exchange,
                                     String routingKey,
                                     AMQP.BasicProperties properties,
                                     byte[] body) throws IOException {
                System.out.println("------handle return--------");
                System.out.println("replyCode:" + replyCode);
                System.out.println("replyText:" + replyText);
                System.out.println("exchange:" + exchange);
                System.out.println("routingKey:" + routingKey);
                System.out.println("properties:" + properties);
                System.out.println("body:" + new String(body, "UTF-8"));
            }
        });

//        channel.basicPublish(exchangeName, routingKey, true, null, msg.getBytes());
        channel.basicPublish(exchangeName, routingKeyError, true, null, msg.getBytes());
    }

}
