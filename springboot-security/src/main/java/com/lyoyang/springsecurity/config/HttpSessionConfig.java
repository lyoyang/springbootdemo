package com.lyoyang.springsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.web.session.HttpSessionEventPublisher;
import org.springframework.session.FindByIndexNameSessionRepository;
import org.springframework.session.data.redis.config.ConfigureRedisAction;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.security.SpringSessionBackedSessionRegistry;

//@EnableRedisHttpSession
public class HttpSessionConfig {

//    @Autowired
//    private FindByIndexNameSessionRepository sessionRepository;
////
//
//
////    @Bean
////    public static ConfigureRedisAction configureRedisAction() {
////        return ConfigureRedisAction.NO_OP;
////    }
//
////    集群环境下控制会话并发的会话注册表实现类
//    @Bean
//    public SpringSessionBackedSessionRegistry springSessionBackedSessionRegistry() {
//        return new SpringSessionBackedSessionRegistry(sessionRepository);
//    }
//
//    //httpSession时间监听，改用session提供的会话注册表
//    @Bean
//    public HttpSessionEventPublisher httpSessionEventPublisher() {
//        return new HttpSessionEventPublisher();
//    }
}
