package com.lyoyang.rabbitmq.api.exchange;

import com.lyoyang.rabbitmq.api.BasicUtil;
import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class ConsumerClient {

    public static void main(String[] args) throws Exception {
//        simpleConsumer();
//        consumerForDirectExchange();
//        consumerForTopic();
        consumerForFanout();
    }


    private static void simpleConsumer() throws IOException, TimeoutException {
        Connection connection = BasicUtil.getConnection();
        Channel channel = connection.createChannel();
        //4 声明（创建）一个队列
        String queueName = "test001";
        channel.queueDeclare(queueName, true, false, false, null);
        channel.basicConsume(queueName, true, buildDeliveryCallBack(), consumerTag -> {});
    }


    private static void consumerForDirectExchange() throws Exception {
        Connection connection = BasicUtil.getConnection();
        Channel channel = connection.createChannel();
        String exchangeName = "test_direct_exchange";
        String routingKey = "test.direct";
        String type = "direct";
        String queueName = "test.direct.quque";
        channel.exchangeDeclare(exchangeName, type, true, false, false, null);
        channel.queueDeclare(queueName, false, false, false, null);
        channel.queueBind(queueName, exchangeName, routingKey);
        channel.basicConsume(queueName, true, buildDeliveryCallBack(), consumerTag -> {});
    }



    private static void consumerForTopic() throws Exception {
        Connection connection = BasicUtil.getConnection();
        Channel channel = connection.createChannel();
        String exchangeName = "test_topic_exchange";
        String type = "topic";
        String routingKey = "user.#";
        String queueName = "test.topic.queue";
        channel.exchangeDeclare(exchangeName, type, true, false, false, null);
        channel.queueDeclare(queueName, false, false, false, null);
        channel.queueBind(queueName, exchangeName, routingKey);
        channel.basicConsume(queueName, true, buildDeliveryCallBack(), consumerTag -> {});
    }



    private static void consumerForFanout() throws Exception {
        Connection connection = BasicUtil.getConnection();
        Channel channel = connection.createChannel();
        String exchangeName = "test_fanout_exchange";
        String type = "fanout";
        String routingKey = "twtwt";
        String queueName = "test.fanout.queue";
        channel.exchangeDeclare(exchangeName, type, true, false, false, null);
        channel.queueDeclare(queueName, false, false, false, null);
        channel.queueBind(queueName, exchangeName, routingKey);
        channel.basicConsume(queueName, true, buildDeliveryCallBack(), consumerTag -> {});
    }



    private static DeliverCallback buildDeliveryCallBack() {
        return (consumerTag, delivery) -> {
            String msg = new String(delivery.getBody(), "UTF-8");
            System.out.println("consumer client received msg:" + msg);
        };
    }


}
