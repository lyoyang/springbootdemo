package com.lyoyang.mapper;

import com.lyoyang.entity.Department;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface DepartmentMapper {

    @Select("SELECT * FROM department WHERE id = #{id}")
    Department getDeptById(Integer id);

    @Delete("DELETE FROM department WHERE id = #{id}")
    int deleteDeptById(Integer id);

    @Update("UPDATE department SET departmentName = #{departmentName} WHERE id = #{id}")
    int updateDept(Department department);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("INSERT INTO department(department_name) VALUES(#{departmentName})")
    int insertDept(Department department);
}
