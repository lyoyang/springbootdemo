package com.lyoyang.springbootjpa.controller;


import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.lyoyang.springbootjpa.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() {
//        int i = 1/0;
        return "hello springboot";
    }

    @RequestMapping("/getUser")
    public Map<Integer,User> getUser() {
        HashMap<String, User> userMap = Maps.newHashMap();
        ArrayList<User> list = Lists.newArrayList();
//        User u1 = new User(1, 23, "jim", "female");
//        User u2 = new User(2, 24, "bob", "male");
//        User u3 = new User(3, 33, "mary", "male");
//        User u4 = new User(4, 23, "gulu", "male");
//        User u5 = new User(5, 23, "coco", "female");
//        list.add(u1);
//        list.add(u2);
//        list.add(u3);
//        list.add(u4);
//        list.add(u5);
        return Maps.uniqueIndex(list, User::getId);
    }
}
