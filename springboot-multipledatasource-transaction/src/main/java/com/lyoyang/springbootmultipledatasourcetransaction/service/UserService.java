package com.lyoyang.springbootmultipledatasourcetransaction.service;


import com.lyoyang.springbootmultipledatasourcetransaction.entity.User;
import com.lyoyang.springbootmultipledatasourcetransaction.test1.UserMapperTest1;
import com.lyoyang.springbootmultipledatasourcetransaction.test2.UserMapperTest2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    private UserMapperTest1 userMapperTest1;

    @Autowired
    private UserMapperTest2 userMapperTest2;

    public void saveUserByTest1(User user){
        userMapperTest1.saveUser(user);
    }

    public void saveUserByTest2(User user){
        userMapperTest2.saveUser(user);
    }

//    @Transactional
    public void saveUser(User user) {
        userMapperTest1.saveUser(user);
//        userMapperTest2.saveUser(user);
//        int a = 1/0;
    }

    public User getByIdFromTest1(Integer id) {
        return userMapperTest1.getById(id);
    }

    public User getByIdFromTest2(Integer id) {
        return userMapperTest2.getById(id);
    }

}
