package com.lyoyang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
public class ThreadPoolConfig {


    @Bean(name = "pool1")
    public ExecutorService pool1() {
        return Executors.newFixedThreadPool(5);
    }

    @Bean(name = "pool2")
    public ExecutorService pool2() {
        return Executors.newFixedThreadPool(3);
    }


    @Bean(name = "pool3")
    public ExecutorService pool3() {
        return Executors.newFixedThreadPool(1);
    }

    @Bean(name = "pool4")
    public ExecutorService pool4() {
        return Executors.newFixedThreadPool(7);
    }



}
