package com.lyoyang;

import com.alibaba.fastjson.JSONObject;
import com.lyoyang.entity.User;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author: Brian
 * @Date: 2020/7/7 11:33
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SendMsgTest {

    @Resource(name = "simpleProducer")
    private DefaultMQProducer simpleProducer;

    @Test
    public void sendMsg() {
        User user = new User();
        user.setId(2);
        user.setAddress("北京市西城区新接口");
        user.setUsername("Brian");
        user.setPassword("123456");
        String data = JSONObject.toJSONString(user);
        Message message = new Message("Simple_Topic", "*", data.getBytes());
        try {
            simpleProducer.send(message);
        } catch (MQClientException e) {
            e.printStackTrace();
        } catch (RemotingException e) {
            e.printStackTrace();
        } catch (MQBrokerException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
