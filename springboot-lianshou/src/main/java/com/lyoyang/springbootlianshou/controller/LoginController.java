package com.lyoyang.springbootlianshou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpServletRequest request) {
        if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password) || !"12345".equals(password)) {
            model.addAttribute("msg", "用户名或密码错误");
            return "login";
        }
        request.getSession().setAttribute("user", username);
        return "redirect:/main.html";
    }



}
