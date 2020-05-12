package com.lyoyang.springbootstart.service;


import com.lyoyang.springbootstart.entity.User;

import com.lyoyang.springbootstart.mapper.UserMapper;
import com.lyoyang.springbootstart.test1.mapper.UserMapperTest1;
import com.lyoyang.springbootstart.test2.mapper.UserMapperTest2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Autowired
    private UserMapperTest1 userMapperTest1;

    @Autowired
    private UserMapperTest2 userMapperTest2;

    @Autowired
    private UserMapper userMapper;
    public void createUser(String name, String password){
        System.out.println("create user start....");
        jdbcTemplate.update("insert into user(username,password) values(?,?)", name, password);
        System.out.println("create user end");
    }

    public User getByName(String name) {
        return userMapper.getByName(name);
    }


    public void saveUserByTest1(User user){
        userMapperTest1.saveUser(user);
    }

    public void saveUserByTest2(User user){
        userMapperTest2.saveUser(user);
    }
}
