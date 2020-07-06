package com.lyoyang.controller;

import com.alibaba.fastjson.JSONObject;
import com.lyoyang.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: Brian
 * @Date: 2020/7/6 18:41
 * @Description:
 */
@RestController
@Slf4j
public class UserController {


    @Resource(name = "simpleProducer")
    private DefaultMQProducer simpleProducer;

    @Value("${rocketmq.simple.topic}")
    private String simpleTopic;

    @Value("${rocketmq.simple.tag}")
    private String simpleTag;



    @RequestMapping("/sendMsg")
    public String sendMsg() {
        log.info("发送数据");
        User user = new User();
        user.setId(2);
        user.setAddress("北京市西城区新接口");
        user.setUsername("Brian");
        user.setPassword("123456");
        String data = JSONObject.toJSONString(user);
        Message message = new Message(simpleTopic, simpleTag, data.getBytes());
        SendResult send;
        try {
            send = simpleProducer.send(message);
        } catch (Exception e) {
            log.error("send msg error", e);
            return "Send Fail";
        }
        log.info("send msg response:" + send.toString());
        return "Send Success";
    }

}
