package com.lyoyang.springbootlianshou.service.impl;

import com.lyoyang.springbootlianshou.entities.User;
import com.lyoyang.springbootlianshou.entities.UserExample;
import com.lyoyang.springbootlianshou.mapper.UserMapper;
import com.lyoyang.springbootlianshou.service.UserService;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Auther: yangbing
 * @Date: 2018/12/28 10:06
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    private static ExecutorService userThread = Executors.newFixedThreadPool(5);

    @Autowired
    private UserMapper userMapper;

    @Override
    public void updateState() {
        int num = 1;
        List<User> userList = null;
        final int pageSize = 1000;
        Map<String, Object> param = new HashMap<>();
        param.put("state", "0");
        param.put("pageSize", pageSize);
        while(CollectionUtils.isNotEmpty(userList = userMapper.getByParam(param))) {
            List<Callable<String>> callableList = new ArrayList<>();
            for(User user : userList) {
//                callableList.add(new UpdateStatueRunner(user));
            }
        }
    }



}
