package com.lyoyang.rabbitmq.api.limit;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CustumConsumer extends DefaultConsumer {

    private Channel channel;

    public CustumConsumer(Channel channel) {
        super(channel);
        this.channel = channel;
    }

    @Override
    public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
        System.out.println("-----consume msg-------");
        System.out.println("body:" + new String(body, "UTF-8"));
        channel.basicAck(envelope.getDeliveryTag(), false);
    }
}
