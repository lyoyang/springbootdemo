package com.lyoyang.springbootwebflux.router;

import com.lyoyang.springbootwebflux.handler.UserInfoHandler;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import javax.annotation.Resource;

/**
 * @author: Brian
 * @Date: 2020/5/19 17:04
 * @Description:
 */
@Component
public class UserInfoRouter {

//    @Resource
//    private UserInfoHandler userInfoHandler;
//
//
//
//    public RouterFunction<ServerResponse> buildResultRouter() {
//        return RouterFunctions
//                .route(RequestPredicates.GET("/s5/get/{id}")
//                        .and(RequestPredicates
//                                .accept(MediaType.APPLICATION_JSON)), userInfoHandler::extraUserInfo);
//    }

}
