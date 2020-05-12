package com.lyoyang.springbootstart.test1.mapper;

import com.lyoyang.springbootstart.entity.User;
import org.apache.ibatis.annotations.Insert;

public interface UserMapperTest1 {

    @Insert("INSERT into user(username,age) VALUES(#{username},#{age})")
    void saveUser(User user);
}
