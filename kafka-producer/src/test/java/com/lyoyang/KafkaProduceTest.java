package com.lyoyang;

import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;
import org.junit.Test;

import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author: Brian
 * @Date: 2020/7/31 15:18
 * @Description:
 */
public class KafkaProduceTest {


    public static Properties initConfig() {
        Properties properties = new Properties();
        String brokerList = "192.168.205.10:9092";
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, brokerList);
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        return properties;
    }


    @Test
    public void sendMsg() {
        KafkaProducer<String, String> kafkaProducer = new KafkaProducer<>(initConfig());
        ProducerRecord<String, String> producerRecord = new ProducerRecord<>("Test_Topic", "Hello Kafka");
        Future<RecordMetadata> send = kafkaProducer.send(producerRecord);
        try {
            RecordMetadata recordMetadata = send.get();
            System.out.println(recordMetadata);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void sendMsgWithCallback() {
        KafkaProducer<String, String> kafkaProducer = new KafkaProducer<>(initConfig());
        ProducerRecord<String, String> producerRecord = new ProducerRecord<>("Test_Topic", "Hello Kafka Callback");
        Future<RecordMetadata> send = kafkaProducer.send(producerRecord, new Callback() {
            @Override
            public void onCompletion(RecordMetadata recordMetadata, Exception e) {
                if (recordMetadata != null) {
                    System.out.println(recordMetadata);
                }
                if (e != null) {
                    System.out.println(e);
                }
            }
        });
    }









}
