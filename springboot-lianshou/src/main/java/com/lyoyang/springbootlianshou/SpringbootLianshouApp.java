package com.lyoyang.springbootlianshou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.lyoyang.springbootlianshou.mapper")
@EnableTransactionManagement
public class SpringbootLianshouApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLianshouApp.class, args);
	}
}
