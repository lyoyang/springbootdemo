package com.lyoyang.springbootwebflux.handler;

import com.lyoyang.springbootwebflux.model.UserModel;
import com.lyoyang.springbootwebflux.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

import java.util.function.Function;

import static org.springframework.http.MediaType.APPLICATION_JSON;

/**
 * @author: Brian
 * @Date: 2020/5/19 16:39
 * @Description:
 */
@Component
public class UserInfoHandler {

//    @Resource
//    private UserService userService;
//
//    public Mono<ServerResponse> extraUserInfo () {
//        Mono<UserModel> userInfo = userService.getUserInfo();
//
//        return userInfo.flatMap(new Function<UserModel, Mono<ServerResponse>>() {
//            @Override
//            public Mono<ServerResponse> apply(UserModel resultViewModel) {
//                return ServerResponse
//                        .ok()
//                        .contentType(APPLICATION_JSON).bodyValue(resultViewModel);
//            }
//        });
//    }



}
