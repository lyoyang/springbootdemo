package com.lyoyang.service.impl;

import com.lyoyang.entity.Student;
import com.lyoyang.entity.User;
import com.lyoyang.mapper.StudentMapper;
import com.lyoyang.service.SimpleService;
import com.lyoyang.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {


    @Resource
    private StudentMapper studentMapper;

    @Resource
    private SimpleService simpleService;

    @Override
    public void saveStudent(Student student) {
        studentMapper.insertSelective(student);
    }
}
