package com.lyoyang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {


    @Autowired
    private KafkaTemplate kafkaTemplate;


    public void sendMsg(String msg) {
        kafkaTemplate.send("Test_Topic", msg);
    }

}
