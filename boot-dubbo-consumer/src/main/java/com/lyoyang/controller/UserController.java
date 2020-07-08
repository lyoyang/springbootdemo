package com.lyoyang.controller;

import com.lyoyang.api.UserService;
import com.lyoyang.entity.MvcMessage;
import com.lyoyang.entity.MvcResponse;
import com.lyoyang.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Iterator;
import java.util.Set;

@RestController
public class UserController {

    @Resource
    private UserService userService;

//    @HystrixCommand(fallbackMethod = "defaultValue")
    @RequestMapping("/getUserById")
    public MvcResponse getUserById(Integer id) {
        try {
            User user = new User();
            user.setId(id);
            user.setPassword("123456");
            user.setUsername("jim" + id);
            User userInfo = userService.getUserInfoById(user);
            return new MvcResponse(MvcMessage.CODE_SUCCESS, userInfo);
        } catch (Exception e) {
            if(e instanceof ConstraintViolationException) {
                Set<ConstraintViolation<?>> violations = ((ConstraintViolationException) e).getConstraintViolations();
                Iterator<ConstraintViolation<?>> iterator = violations.iterator();
                while (iterator.hasNext()) {
                    return new MvcResponse(MvcResponse.CODE_FAILURE, iterator.next().getMessage());
                }
            }
            return new MvcResponse(MvcMessage.CODE_ERROR);
        }
    }

    public User defaultValue(Integer id) {
        User user = new User();
//        user.setEmail("default");
//        user.setName("default");
        return user;
    }


    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }




}
