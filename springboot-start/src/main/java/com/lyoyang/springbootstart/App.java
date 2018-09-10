package com.lyoyang.springbootstart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.lyoyang.springbootstart.controller","com.lyoyang.springbootstart.service","com.lyoyang.springbootstart.datasource","com.lyoyang.springbootstart.aspect"})
@EnableAutoConfiguration
@MapperScan("com.lyoyang.springbootstart.mapper")
@SpringBootConfiguration
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
