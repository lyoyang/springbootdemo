package com.lyoyang.rabbitmq.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class RocketMqProducer {

    @Value("${rocketmq.producer.groupName}")
    private String groupName;

    @Value("${rocketmq.producer.namesrvAddr}")
    private String namesServer;

    @Value("${rocketmq.producer.maxMessageSize}")
    private Integer maxMessageSize;

    @Value("${rocketmq.producer.sendMsgTimeout}")
    private Integer sendMsgTimeOut;

    @Value("${rocketmq.producer.retryTimesWhenSendFailed}")
    private Integer retryTimesWhenSendFaild;

    @Bean
    public DefaultMQProducer defaultMQProducer() {
        DefaultMQProducer producer = new DefaultMQProducer("GID_cleanMessage");
        producer.setNamesrvAddr(namesServer);
        producer.setMaxMessageSize(maxMessageSize);
        producer.setSendMsgTimeout(sendMsgTimeOut);
        producer.setRetryTimesWhenSendFailed(retryTimesWhenSendFaild);
        try {
            producer.start();
            log.info("producer is start with group name:[%s], namesrvAdder:[%s]", groupName, namesServer);

        } catch (MQClientException e) {
            e.printStackTrace();
        }
        return producer;
    }
}
