package com.lyoyang.consumer;

import com.lyoyang.entity.Order;
import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

@Component
@Slf4j
public class OrderConsumer {


    /**
     * rabbitmq.simple.queue.name=simple_queue
     * rabbitmq.simple.queue.durable=true
     * rabbitmq.simple.exchange.name=simple_exchange
     * rabbitmq.simple.exchange.durable=true
     * rabbitmq.simple.exchange.type=topic
     * rabbitmq.simple.exchange.ignoreDeclarationExceptions=true
     * rabbitmq.simple.key=simple.*
     * @param message
     * @param channel
     * @throws IOException
     */

    @RabbitListener(
            bindings = @QueueBinding(value = @Queue(value = "${rabbitmq.simple.queue.name}", durable = "${rabbitmq.simple.queue.durable}"),
                    exchange = @Exchange(value = "${rabbitmq.simple.exchange.name}", durable = "${rabbitmq.simple.exchange.durable}", type = "${rabbitmq.simple.exchange.type}", ignoreDeclarationExceptions = "${rabbitmq.simple.exchange.ignoreDeclarationExceptions}"), key = "${rabbitmq.simple.key}")
    )
    @RabbitHandler
    public void onMessage(Message message, Channel channel) throws IOException {
        log.info("consume msg:" + message.getPayload());
        Long deliverTag = (Long) message.getHeaders().get(AmqpHeaders.DELIVERY_TAG);
        channel.basicAck(deliverTag, false);
    }


    /**
     * rabbitmq.order.queue.name=order_queue
     * rabbitmq.order.queue.durable=true
     * rabbitmq.order.exchange.name=order_exchange
     * rabbitmq.order.exchange.durable=true
     * rabbitmq.order.exchange.type=topic
     * rabbitmq.order.exchange.ignoreDeclarationExceptions=true
     * rabbitmq.order.key=simpleorder.*
     * @param order
     * @param channel
     * @param headers
     * @throws IOException
     */

    @RabbitListener(
            bindings = @QueueBinding(value = @Queue(value = "${rabbitmq.order.queue.name}", durable = "${rabbitmq.order.queue.durable}"),
                    exchange = @Exchange(value = "${rabbitmq.order.exchange.name}", durable = "${rabbitmq.order.exchange.durable}", type = "${rabbitmq.order.exchange.type}", ignoreDeclarationExceptions = "${rabbitmq.order.exchange.ignoreDeclarationExceptions}"), key = "${rabbitmq.order.key}")
    )
    @RabbitHandler
    public void onOrderMsg(@Payload Order order, Channel channel, @Headers Map<String, Object> headers) throws IOException {
        log.info("reveive order:" + order.getTransId());
        Long deliverTag = (Long) headers.get(AmqpHeaders.DELIVERY_TAG);
        if (order.getTransId().equals("454675675")) {
            channel.basicNack(deliverTag, false, false);
        } else {
            channel.basicAck(deliverTag, false);
        }
    }


}
