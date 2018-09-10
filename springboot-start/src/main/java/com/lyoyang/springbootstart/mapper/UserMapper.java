package com.lyoyang.springbootstart.mapper;

import com.lyoyang.springbootstart.entity.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("SELECT * FROM user WHERE username=#{name}")
    User getByName(String name);
}
