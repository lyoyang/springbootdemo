package com.lyoyang.springbootstart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ComponentScan(basePackages = {"com.lyoyang.springbootstart.controller","com.lyoyang.springbootstart.service","com.lyoyang.springbootstart.entity","com.lyoyang.springbootstart.datasource","com.lyoyang.springbootstart.aspect"})
@EnableAutoConfiguration
@MapperScan("com.lyoyang.springbootstart.mapper")
@SpringBootConfiguration
@EnableConfigurationProperties
@EnableSwagger2
public class App extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(App.class);
	}
}
