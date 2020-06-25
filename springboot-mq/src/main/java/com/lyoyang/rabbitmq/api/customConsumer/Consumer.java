package com.lyoyang.rabbitmq.api.customConsumer;

import com.lyoyang.rabbitmq.api.BasicUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class Consumer {

    public static void main(String[] args) throws Exception {
        Connection connection = BasicUtil.getConnection();
        Channel channel = connection.createChannel();
        String exchangeName = "test_confirm_exchange";
        String routingKey = "confirm.#";
        String queueName = "test_confirm_queue";
        channel.exchangeDeclare(exchangeName, "topic", true);
        channel.queueDeclare(queueName, true, false, false, null);
        channel.queueBind(queueName, exchangeName, routingKey);
        channel.basicConsume(queueName, true, new CustumConsumer(channel));

    }

}
