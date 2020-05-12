package com.lyoyang.mapper;

import com.lyoyang.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {


    void saveEmployee(Employee employee);

    Employee getEmplById(Integer id);

}
