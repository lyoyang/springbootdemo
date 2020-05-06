package com.lyoyang.springsecurity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class DemoTest {

    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);
        System.out.println(passwordEncoder.encode("12345"));
    }

}
