package com.lyoyang.rabbitmq.api.confirm;

import com.lyoyang.rabbitmq.api.BasicUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.ConfirmListener;
import com.rabbitmq.client.Connection;

import java.io.IOException;

public class Producer {

    public static void main(String[] args) throws Exception {
        Connection connection = BasicUtil.getConnection();
        Channel channel = connection.createChannel();
        //指定消息的投递模式：消息的确认模式
        channel.confirmSelect();
        String exchangeName = "test_confirm_exchange";
        String routingKey = "confirm.abcd";
        String msg = "this is a confirm test";
        channel.basicPublish(exchangeName, routingKey, null, msg.getBytes());
        channel.addConfirmListener(new ConfirmListener() {
            @Override
            public void handleAck(long l, boolean b) throws IOException {
                System.err.println("ack success");
            }

            @Override
            public void handleNack(long l, boolean b) throws IOException {
                System.err.println("no ack");
            }
        });
    }

}
