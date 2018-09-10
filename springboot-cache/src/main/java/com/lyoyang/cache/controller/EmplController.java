package com.lyoyang.cache.controller;

import com.lyoyang.cache.entity.Employee;
import com.lyoyang.cache.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmplController {


    @Autowired
    private EmployService employService;


    @RequestMapping("/getEmplById/{id}")
    public Employee getEmplById(@PathVariable("id") Integer id) {
        return employService.getEmplById(id);
    }


    @RequestMapping("/updateEmpl")
    public Employee updateEmpl(Employee employee) {
        return employService.updateEmpl(employee);
    }

    @RequestMapping("/delEmp")
    public String delEmp(Integer id) {
        employService.delEmpl(id);
        return "success";
    }



}
