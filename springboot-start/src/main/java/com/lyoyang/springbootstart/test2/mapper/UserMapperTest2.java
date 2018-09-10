package com.lyoyang.springbootstart.test2.mapper;

import com.lyoyang.springbootstart.entity.User;
import org.apache.ibatis.annotations.Insert;

public interface UserMapperTest2 {

    @Insert("INSERT into user(username,age) VALUES(#{username},#{age})")
    void saveUser(User user);
}
