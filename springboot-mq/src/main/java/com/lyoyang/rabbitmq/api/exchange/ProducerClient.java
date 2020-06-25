package com.lyoyang.rabbitmq.api.exchange;

import com.lyoyang.rabbitmq.api.BasicUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class ProducerClient {


    public static void main(String[] args) throws Exception {
//        simpleProducer();
//        producerForDirectExchange();
//        producerForTopicExchange();
        producerForFanoutExchange();
    }


    private static void simpleProducer() throws IOException, TimeoutException {
        Connection connection = BasicUtil.getConnection();
        Channel channel = connection.createChannel();
        //4 通过Channel发送数据
        for(int i=0; i < 5; i++){
            String msg = "Hello RabbitMQ!";
            //1 exchange   2 routingKey
            channel.basicPublish("", "test001", null, msg.getBytes());
        }
        //5 记得要关闭相关的连接
        channel.close();
        connection.close();
    }

    private static void producerForDirectExchange() throws Exception {
        Connection connection = BasicUtil.getConnection();
        Channel channel = connection.createChannel();
        String exchangeName = "test_direct_exchange";
        String routingKey = "test.direct";
        String msg = "this is a test for direct exchange";
        channel.basicPublish(exchangeName, routingKey, null, msg.getBytes());
        channel.close();
        connection.close();
    }

    private static void producerForTopicExchange() throws Exception {
        Connection connection = BasicUtil.getConnection();
        Channel channel = connection.createChannel();
        String exchangeName = "test_topic_exchange";
        String routingKey1 = "user.save";
        String routingKey2 = "user.update";
        String routingKey3 = "user.delete.dfd";
        String msg = "this is a test for topic exchange";
        channel.basicPublish(exchangeName, routingKey1, null, msg.getBytes());
        channel.basicPublish(exchangeName, routingKey2, null, msg.getBytes());
        channel.basicPublish(exchangeName, routingKey3, null, msg.getBytes());
        channel.close();
        connection.close();
    }

    private static void producerForFanoutExchange() throws Exception {
        Connection connection = BasicUtil.getConnection();
        Channel channel = connection.createChannel();
        String exchangeName = "test_fanout_exchange";
        String routingKey = "";
        String msg = "this is a test for fanout exchange";
        channel.basicPublish(exchangeName, routingKey, null, msg.getBytes());
        channel.close();
        connection.close();
    }



}
