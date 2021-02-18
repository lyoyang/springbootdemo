package com.lyoyang.sentinel;

import com.alibaba.csp.sentinel.init.InitExecutor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SentinelApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SentinelApplication.class, args);

        System.setProperty("project.name",
                context.getEnvironment().getProperty("spring.application.name","sentinel"));
        System.setProperty("csp.sentinel.dashboard.server",
                context.getEnvironment().getProperty("sentinel.dashboard.server","localhost:8080"));
        InitExecutor.doInit();


    }

}
