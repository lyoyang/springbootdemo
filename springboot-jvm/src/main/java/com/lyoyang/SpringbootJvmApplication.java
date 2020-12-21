package com.lyoyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringbootJvmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJvmApplication.class, args);
    }

}
