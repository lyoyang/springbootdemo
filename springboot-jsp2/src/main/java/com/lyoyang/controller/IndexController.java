package com.lyoyang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/main")
    public String main(Model model) {
        model.addAttribute("msg","hello jsp");
        return "main";
    }

}
