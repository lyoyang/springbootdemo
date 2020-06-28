package com.lyoyang.producer;

import com.lyoyang.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Slf4j
public class OrderProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${rabbitmq.simple.exchange.name}")
    private String simpleExchange;

    @Value("${rabbitmq.simple.key}")
    private String simpleKey;

    @Value("${rabbitmq.order.exchange.name}")
    private String orderExchange;

    @Value("${rabbitmq.order.key}")
    private String orderKey;

    private final RabbitTemplate.ConfirmCallback confirmCallback = (correlationData, ack, cause) -> {
        log.info("correlationData:" + correlationData);
        log.info("ack:" + ack);
        if (!ack) {
            log.error("confirm error:" + cause);
        }
    };


    private final RabbitTemplate.ReturnCallback returnCallback = (message, replyCode, replyText, exchange, routingKey) -> {
        log.error("message:" + message);
        log.error("replyCode:" + replyCode);
        log.error("replyText:" + replyText);
        log.error("exchange:" + exchange);
        log.error("routingKey:" + routingKey);

    };


    public void send(Object message, Map<String, Object> properties) {
        MessageHeaders messageHeaders = new MessageHeaders(properties);
        Message<Object> msg = MessageBuilder.createMessage(message, messageHeaders);
        CorrelationData correlationData = new CorrelationData(System.currentTimeMillis() + "");
        rabbitTemplate.setReturnCallback(returnCallback);
        rabbitTemplate.setConfirmCallback(confirmCallback);
        rabbitTemplate.convertAndSend(simpleExchange, simpleKey, msg, correlationData);
    }



    public void sendOrder(Order order) {
        CorrelationData correlationData = new CorrelationData(order.getTransId());
        rabbitTemplate.setReturnCallback(returnCallback);
        rabbitTemplate.setConfirmCallback(confirmCallback);
        rabbitTemplate.convertAndSend(orderExchange, orderKey, order, correlationData);
    }



}
