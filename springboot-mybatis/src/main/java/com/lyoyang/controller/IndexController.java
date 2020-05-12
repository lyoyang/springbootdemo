package com.lyoyang.controller;

//import com.lyoyang.entity.Department;
//import com.lyoyang.entity.Employee;
//import com.lyoyang.mapper.DepartmentMapper;
//import com.lyoyang.mapper.EmployeeMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@RestController
public class IndexController {

    private static final Logger LOG = LoggerFactory.getLogger(IndexController.class);

//    @Autowired
//    private DepartmentMapper departmentMapper;
//
//    @Autowired
//    private EmployeeMapper employeeMapper;
//
//    @RequestMapping("/")
//    public String index() {
//        return "hello";
//    }
//
//    @RequestMapping("/saveDept")
//    public Department saveDept(Department department) {
//        departmentMapper.insertDept(department);
//        return department;
//    }
//
//
//    @RequestMapping("/updateDept")
//    public int updateDept(Department department) {
//        int i = departmentMapper.updateDept(department);
//        return i;
//    }
//
//    @RequestMapping("/delDept")
//    public int delDept(Integer id) {
//        return departmentMapper.deleteDeptById(id);
//    }
//
//    @RequestMapping("/getDeptById")
//    public Department getDeptById(Integer id) {
//        return departmentMapper.getDeptById(id);
//    }
//
//    @RequestMapping("/saveEmpl")
//    public int saveEmpl(Employee employee) {
//        employeeMapper.saveEmployee(employee);
//        return employee.getId();
//    }
//
//    @RequestMapping("/getEmplById")
//    public Employee getEmplById(Integer id) {
//        return employeeMapper.getEmplById(id);
//    }

    @Autowired
    private DataSource dataSource;

    @RequestMapping("/index")
    public String index() {
        try {
            Connection connection = dataSource.getConnection();
            LOG.info("连接信息：" + connection);
        } catch (SQLException e) {
            LOG.error("异常", e);
        }
        return "index";
    }

}
