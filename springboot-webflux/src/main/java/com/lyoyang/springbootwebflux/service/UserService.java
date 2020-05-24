package com.lyoyang.springbootwebflux.service;

import com.lyoyang.springbootwebflux.model.UserModel;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Brian
 * @Date: 2020/5/19 16:35
 * @Description:
 */
@Service
public class UserService {

    private static List<UserModel> userModels = new ArrayList<>();

    static {
        userModels.add(UserModel.builder().id("1").name("alice").build());
        userModels.add(UserModel.builder().id("2").name("bob").build());
        userModels.add(UserModel.builder().id("3").name("brian").build());
        userModels.add(UserModel.builder().id("4").name("tom").build());
        userModels.add(UserModel.builder().id("5").name("frank").build());
    }


    public Mono<UserModel> getUserInfo () {
        return Mono.justOrEmpty(UserModel.builder().id("12").name("vivian").build());
    }

    public Flux<UserModel> list() {
        return Flux.fromIterable(userModels);
    }





}
