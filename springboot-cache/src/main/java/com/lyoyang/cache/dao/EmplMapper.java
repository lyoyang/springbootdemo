package com.lyoyang.cache.dao;

import com.lyoyang.cache.entity.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface EmplMapper {

    @Select("SELECT * FROM employee WHERE id = #{id}")
    Employee getEmplById(Integer id);

    @Insert("INSERT INTO employee VALUES(null,#{lastName},#{email},#{gender},#{d_id})")
    void saveEmpl(Employee employee);


    @Update("UPDATE employee SET lastName=#{lastName}, gender=#{gender} WHERE id=#{id}")
    void updateEmpl(Employee employee);



    @Delete("DELETE from employee WHERE id=#{id}")
    void delEmpl(Integer id);





}
