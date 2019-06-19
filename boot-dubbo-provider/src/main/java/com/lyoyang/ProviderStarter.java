package com.lyoyang;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDubbo
//@EnableHystrix
public class ProviderStarter {

    public static void main(String[] args) {
        SpringApplication.run(ProviderStarter.class, args);
    }
}
