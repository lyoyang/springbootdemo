package com.lyoyang.listener;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(topics = "Test_Topic")
    public void  onMessage(String message) {
        System.out.println("received msg:" + message);
    }

}
