package com.lyoyang.springbootredis.dao;


import com.lyoyang.springbootredis.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {


    @Insert("INSERT INTO user(username,age) values(#{username},#{age})")
    public void saveUser(User user);

    @Select("SELECT * FROM user WHERE username=#{name}")
    User getByName(String name);

    @Select("SELECT * FROM user WHERE id=#{id}")
    User getById(Integer id);
}
