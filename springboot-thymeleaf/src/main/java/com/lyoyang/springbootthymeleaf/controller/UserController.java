package com.lyoyang.springbootthymeleaf.controller;


import com.lyoyang.springbootthymeleaf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/userList")
    public ModelAndView userList(){
        List<User> list = new ArrayList<User>();
        for (int i = 0; i<10; i++){
            User user = new User(i, i+2, "第" + i + "个", "男" + i);
            list.add(user);
        }
        ModelAndView modelAndView = new ModelAndView("/userList");
        modelAndView.addObject("userList", list);

        return modelAndView;
    }

    @RequestMapping("/userView")
    public String userView() {
        return "userView";
    }
}
