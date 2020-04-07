package com.lyoyang.springbootlianshou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.lyoyang.springbootlianshou.mapper")
public class SpringbootLianshouApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLianshouApp.class, args);
	}
}
