package com.lyoyang.dao;

import com.lyoyang.ApplicationTests;
import com.lyoyang.springbootlianshou.entities.User;
import com.lyoyang.springbootlianshou.mapper.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: yangbing
 * @Date: 2018/12/14 15:49
 * @Description:
 */
public class UserTest extends ApplicationTests {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void test_batchSavve() {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        User user = new User();
        for(int i = 1; i<=10000; i++ ) {
            user.setName("test-" + i);
            user.setBirthday(100 + i + "");
            userMapper.insertSelective(user);
        }
        System.out.println("花费时间：" + (System.currentTimeMillis() - startTime));
    }

    @Test
    public void test_copy() {
        System.out.println(123);
    }

}
