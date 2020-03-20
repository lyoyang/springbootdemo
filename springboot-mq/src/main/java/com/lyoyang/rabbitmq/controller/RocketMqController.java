package com.lyoyang.rabbitmq.controller;

import com.alibaba.fastjson.JSONObject;
import com.lyoyang.rabbitmq.bean.User;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/rocket")
public class RocketMqController {

    private static final Logger LOG = LoggerFactory.getLogger(RocketMqController.class);

    @Resource
    private DefaultMQProducer defaultMQProducer;

    @RequestMapping("/sendData")
    public String sendData() throws InterruptedException, RemotingException, MQClientException, MQBrokerException {
        LOG.info("发送数据");
        User.UserBuilder builder = User.builder();
        User build = builder.id(12).username("jim").gender("male").build();
        String data = JSONObject.toJSONString(build);
        Message message = new Message("Test_Topic", "testTag", data.getBytes());
        SendResult send = defaultMQProducer.send(message);
        LOG.info("send msg response:" + send.toString());
        return "success";
    }



}
