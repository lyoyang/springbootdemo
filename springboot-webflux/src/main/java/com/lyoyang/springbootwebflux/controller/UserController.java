package com.lyoyang.springbootwebflux.controller;

import com.lyoyang.springbootwebflux.model.UserModel;
import com.lyoyang.springbootwebflux.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

/**
 * @author: Brian
 * @Date: 2020/5/19 17:15
 * @Description:
 */


@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/getUserInfo")
    public Mono<UserModel> getUserInfo () {
        return userService.getUserInfo();
    }

    @RequestMapping("/list")
    public Flux<UserModel> list() {
        return userService.list();
    }



}
