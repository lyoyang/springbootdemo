package com.lyoyang.service.impl;

import com.lyoyang.entity.Student;
import com.lyoyang.entity.User;
import com.lyoyang.mapper.StudentMapper;
import com.lyoyang.mapper.UserMapper;
import com.lyoyang.service.SimpleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SimpleServiceImpl implements SimpleService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private StudentMapper studentMapper;


    @Override
    public void saveEmployee(User user) {
        userMapper.insertSelective(user);
    }

    @Override
    public void updateStudent() {
        Student ss = new Student();
        ss.setId(2);
        ss.setUsername("bob");
        studentMapper.updateByPrimaryKeySelective(ss);
    }
}
