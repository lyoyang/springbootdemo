package com.lyoyang.rocketmq.config;

import com.lyoyang.rocketmq.listener.SimpleMessageListener;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.MessageSelector;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.protocol.heartbeat.MessageModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author: Brian
 * @Date: 2020/7/6 10:29
 * @Description:
 */
@Configuration
@Slf4j
public class MqConfig {

    @Value("${rocketmq.simple.groupName}")
    private String groupName;

    @Value("${rocketmq.simple.topic}")
    private String simpleTopic;

    @Value("${rocketmq.simple.tag}")
    private String simpleTag;

    @Value("${rocketmq.namesrvAddr}")
    private String brokerServer;

    @Value("${rocketmq.consumer.consumeThreadMin}")
    private int minThread;

    @Value("${rocketmq.consumer.consumeThreadMax}")
    private int maxThread;

    @Value("${rocketmq.consumer.consumeMessageBatchMaxSize}")
    private int maxConsumeBatchSize;

    @Resource
    private SimpleMessageListener simpleMessageListener;


    @Bean
    public DefaultMQPushConsumer getRocketMqConsumer() {

        DefaultMQPushConsumer defaultMQPushConsumer = new DefaultMQPushConsumer();
        defaultMQPushConsumer.setNamesrvAddr(brokerServer);
        //设置消费模型，集群还是广播，默认为集群
        defaultMQPushConsumer.setMessageModel(MessageModel.CLUSTERING);
//        defaultMQPushConsumer.setMessageModel(MessageModel.BROADCASTING);
        defaultMQPushConsumer.setConsumeThreadMin(minThread);
        defaultMQPushConsumer.setConsumeThreadMax(maxThread);
        defaultMQPushConsumer.registerMessageListener(simpleMessageListener);
        defaultMQPushConsumer.setConsumerGroup(groupName);
        /**
         *设置Consumer第一次启动是从队列头部开始消费还是队列尾部开始消费
         *如果非第一次启动，那么按照上次消费的位置继续消费
         */
        defaultMQPushConsumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_LAST_OFFSET);
        //设置一次消费消息的条数，默认为1条
        defaultMQPushConsumer.setConsumeMessageBatchMaxSize(maxConsumeBatchSize);
        try {
            defaultMQPushConsumer.subscribe(simpleTopic, "*");
//            defaultMQPushConsumer.subscribe(simpleTopic, MessageSelector.bySql(""));
            defaultMQPushConsumer.start();
        } catch (MQClientException e) {
            log.error("RocketMQ Consumer Error", e);
        }
        return defaultMQPushConsumer;
    }

}
