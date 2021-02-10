package com.lyoyang.service;


import com.lyoyang.entity.Student;
import com.lyoyang.mapper.StudentMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class CustomService {

    private static final ExecutorService EXECUTOR_SERVICE = Executors.newSingleThreadExecutor();

    @Resource
    private StudentService studentService;

    @Resource
    private StudentMapper studentMapper;

    @Resource
    private SimpleService simpleService;


    public void saveStudent() {
        Student student = new Student();
        student.setUsername("jim");
        student.setGender("ll");
        student.setAge(12);
        EXECUTOR_SERVICE.submit(new MyRunnable(student));
    }



    class MyRunnable implements Runnable {

        private Student student;

        public MyRunnable(Student student) {
            this.student = student;
        }

        @Override
        public void run() {
//            studentService.saveStudent(student);
            modifyz(student);
        }
    }





    @Transactional(rollbackFor = Exception.class)
    public void modifyz(Student student) {
        simpleService.updateStudent();
        int i = 1 / 0;
        studentMapper.insertSelective(student);
    }




}
