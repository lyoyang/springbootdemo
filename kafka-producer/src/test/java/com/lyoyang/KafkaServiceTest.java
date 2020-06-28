package com.lyoyang;

import com.lyoyang.service.KafkaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaServiceTest {

    @Resource
    private KafkaService kafkaService;

    @Test
    public void sendMsg() {
        kafkaService.sendMsg("hell, it a test");
    }

}
