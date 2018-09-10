package com.lyoyang.springbootsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "redirect:/home";
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    /**
     * 登录的时候不会走这个路由，会走Security自定义的路由
     * @return
     */
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/user")
    public String userView() {
        return "userInfo";
    }

    @GetMapping("/loginError")
    public String loginError(Model model) {
        model.addAttribute("loginError",true);
        model.addAttribute("errorMsg","用户名或密码错误");
        return "login";
    }
}
