package com.lyoyang.springbootmultipledatasourcetransaction.test2;

import com.lyoyang.springbootmultipledatasourcetransaction.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserMapperTest2 {

    @Insert("INSERT into user(username,age) VALUES(#{username},#{age})")
    void saveUser(User user);

    @Select("SELECT * FROM user WHERE id = #{id}")
    User getById(Integer id);
}
