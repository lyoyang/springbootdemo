package com.lyoyang.springbootmultipledatasourcetransaction;

import com.lyoyang.springbootmultipledatasourcetransaction.datasource.DBConfig1;
import com.lyoyang.springbootmultipledatasourcetransaction.datasource.DBConfig2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
