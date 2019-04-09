package com.lyoyang.controller;

import com.lyoyang.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class UserController {

    private List<User> userList = new ArrayList<>();

    @RequestMapping("/addUser")
    public void addUser() {
        while (true) {
            String uuid = UUID.randomUUID().toString();
            userList.add(new User(uuid, uuid + ":user"));
        }
    }

}
