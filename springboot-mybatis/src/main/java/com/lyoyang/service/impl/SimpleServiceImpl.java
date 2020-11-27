package com.lyoyang.service.impl;

import com.lyoyang.entity.User;
import com.lyoyang.mapper.UserMapper;
import com.lyoyang.service.SimpleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SimpleServiceImpl implements SimpleService {

    @Resource
    private UserMapper userMapper;


    @Override
    public void saveEmployee(User user) {
        userMapper.insertSelective(user);
    }
}
