package com.lyoyang.cache.controller;

import com.lyoyang.cache.entity.Department;
import com.lyoyang.cache.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/getDeptById/{id}")
    public Department getDeptById(@PathVariable("id") Integer id) {
        return deptService.getDeptById(id);
    }

}
