package com.lyoyang.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.lyoyang.service"})
@ConditionalOnProperty(prefix = "study", name = "enable", havingValue = "true")
public class CustomConfig {
}
