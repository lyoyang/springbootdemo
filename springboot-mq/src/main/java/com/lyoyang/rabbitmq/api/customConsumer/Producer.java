package com.lyoyang.rabbitmq.api.customConsumer;

import com.lyoyang.rabbitmq.api.BasicUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.ConfirmListener;
import com.rabbitmq.client.Connection;

import java.io.IOException;

public class Producer {

    public static void main(String[] args) throws Exception {
        Connection connection = BasicUtil.getConnection();
        Channel channel = connection.createChannel();
        String exchangeName = "test_confirm_exchange";
        String routingKey = "confirm.abcd";
        String msg = "this is a confirm test";
        channel.basicPublish(exchangeName, routingKey, null, msg.getBytes());
        channel.addConfirmListener(new ConfirmListener() {
            @Override
            public void handleAck(long l, boolean b) throws IOException {
                System.out.println("ack success");
            }

            @Override
            public void handleNack(long l, boolean b) throws IOException {
                System.out.println("no ack");
            }
        });
    }

}
