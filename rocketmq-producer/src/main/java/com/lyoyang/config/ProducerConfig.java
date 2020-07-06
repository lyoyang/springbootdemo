package com.lyoyang.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Brian
 * @Date: 2020/7/6 18:27
 * @Description:
 */
@Configuration
@Slf4j
public class ProducerConfig {

    @Value("${rocketmq.simple.groupName}")
    private String groupName;


    @Value("${rocketmq.namesrvAddr}")
    private String brokerServer;

    @Value("${rocketmq.meessage.max.size}")
    private int maxMessageSize;

    @Value("${rocketmq.producer.retryTimesWhenSendFailed}")
    private int retryTimes;

    @Value("${rocketmq.producer.sendMsgTimeout}")
    private int sendTimeout;





    @Bean(name = "simpleProducer")
    public DefaultMQProducer defaultMQProducer() {
        DefaultMQProducer defaultMQProducer = new DefaultMQProducer();
        defaultMQProducer.setProducerGroup(groupName);
        defaultMQProducer.setNamesrvAddr(brokerServer);
        defaultMQProducer.setMaxMessageSize(maxMessageSize);
        defaultMQProducer.setSendMsgTimeout(sendTimeout);
        defaultMQProducer.setRetryTimesWhenSendFailed(retryTimes);
        try {
            defaultMQProducer.start();
        } catch (MQClientException e) {
            log.error("simpleProducer start exception", e);
        }
        return defaultMQProducer;
    }




}
