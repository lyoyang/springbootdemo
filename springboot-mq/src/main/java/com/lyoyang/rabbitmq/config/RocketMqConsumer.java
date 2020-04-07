package com.lyoyang.rabbitmq.config;

import com.lyoyang.rabbitmq.service.MQConsumeMsgListenerProcessor;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class RocketMqConsumer {

    @Value("${rocketmq.consumer.namesrvAddr}")
    private String namesrvAddr;

    @Value("${rocketmq.consumer.groupName}")
    private String groupNmae;

    @Value("${rocketmq.consumer.consumeThreadMin}")
    private int customerThreadMin;

    @Value("${rocketmq.consumer.consumeThreadMax}")
    private int customerThreadMax;

    @Value("${rocketmq.consumer.topics}")
    private String topic;

    @Value("${rocketmq.consumer.consumeMessageBatchMaxSize}")
    private int consumeMessageBatchMaxSize;

    @Autowired
    private MQConsumeMsgListenerProcessor mqConsumeMsgListenerProcessor;


    @Bean
    public DefaultMQPushConsumer getRocketMQConsumer() throws Exception {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer(groupNmae);
        consumer.setNamesrvAddr(namesrvAddr);
        consumer.setConsumeThreadMin(customerThreadMin);
        consumer.setConsumeThreadMax(customerThreadMax);
        consumer.registerMessageListener(mqConsumeMsgListenerProcessor);
        /**
         * 设置Consumer第一次启动是从队列头部开始消费还是队列尾部开始消费
         * 如果非第一次启动，那么按照上次消费的位置继续消费
         */
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_LAST_OFFSET);
        /**
         * 设置消费模型，集群还是广播，默认为集群
         */
        //consumer.setMessageModel(MessageModel.CLUSTERING);
        /**
         * 设置一次消费消息的条数，默认为1条
         */
        consumer.setConsumeMessageBatchMaxSize(consumeMessageBatchMaxSize);
        try {
            /**
             * 设置该消费者订阅的主题和tag，如果是订阅该主题下的所有tag，则tag使用*；如果需要指定订阅该主题下的某些tag，则使用||分割，例如tag1||tag2||tag3
             */
            String[] topicTagsArr = topic.split(";");
            for (String topicTags : topicTagsArr) {
                String[] topicTag = topicTags.split("~");
                consumer.subscribe(topicTag[0],topicTag[1]);
            }
            consumer.start();
            log.info("consumer is start !!! groupName:{},topics:{},namesrvAddr:{}",groupNmae, topicTagsArr, namesrvAddr);
        }catch (Exception e){
            log.error("consumer is start !!! groupName:{},topics:{},namesrvAddr:{}",groupNmae,topic,namesrvAddr,e);
        }
        return consumer;
    }


}
