package com.lyoyang.service;

import com.lyoyang.entity.Student;
import org.springframework.transaction.annotation.Transactional;

public interface StudentService {


    @Transactional(rollbackFor = Exception.class)
    void saveStudent(Student student);


}
