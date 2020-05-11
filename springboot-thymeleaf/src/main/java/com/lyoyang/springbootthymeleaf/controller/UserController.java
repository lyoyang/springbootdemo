package com.lyoyang.springbootthymeleaf.controller;


import com.lyoyang.springbootthymeleaf.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
@Api("用户接口")
public class UserController {
    @ApiOperation("获取用户列表")
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

    @ApiOperation("用户视图获取")
    @RequestMapping("/userView")
    public String userView() {
        return "userView";
    }


    @ApiOperation("获取用户详情")
    @ApiImplicitParam(name = "name", value = "用户名")
    @RequestMapping("/getUserInfo")
    public String getUserInfo(String name) {
        return name;
    }
}
