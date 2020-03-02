package com.lyoyang.springsecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "hello index";
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

//    /**
//     * 登录的时候不会走这个路由，会走Security自定义的路由
//     * @return
//     */
//    @GetMapping("/login")
//    public String login() {
//        return "login";
//    }
//
//    @RequestMapping("/user")
//    public String userView() {
//        return "userInfo";
//    }
//
//    @GetMapping("/loginError")
//    public String loginError(Model model) {
//        model.addAttribute("loginError",true);
//        model.addAttribute("errorMsg","用户名或密码错误");
//        return "login";
//    }
}
