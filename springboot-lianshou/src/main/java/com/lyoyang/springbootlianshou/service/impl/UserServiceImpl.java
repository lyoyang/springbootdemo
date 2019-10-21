package com.lyoyang.springbootlianshou.service.impl;

import com.lyoyang.springbootlianshou.entities.User;
import com.lyoyang.springbootlianshou.mapper.UserMapper;
import com.lyoyang.springbootlianshou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
        List<Callable<String>> callables = new ArrayList<>();
        for(int i = 0; i< 10; i++) {
            callables.add(new UserRunner(i));
        }
        try {
            userThread.invokeAll(callables);
        } catch (Exception e) {
            System.out.println("主线程发生异常--》" + e.getMessage());
        }
    }

    class UserRunner implements Callable<String> {

        private int i;

        public UserRunner(int i) {
            this.i = i;
        }

        @Override
        public String call() throws Exception {
//            try {
                User user = new User();
                user.setName("demo" + i);
                user.setState(Integer.toString(i));
                UserServiceImpl userService = new UserServiceImpl();
                userService.addUser(user);
                return "OK";
//            } catch (Exception e) {
//                System.out.println("发生异常|" + e.getMessage());
//                throw e;
//            }
        }
    }

    @Transactional(rollbackFor = Exception.class)
    public void addUser(User u) {
        userMapper.insertSelective(u);
        if(u.getState().equals("2")) {
            int a = 1/0;
        }
    }


    @Override
//    @Transactional(rollbackFor = Exception.class)
    public void addUserInfo(User user) {
        try {
            userMapper.insertSelective(user);
            int a = 1/0;
        } catch (Exception e) {
            System.out.println("发生异常：" + e.toString());
            throw e;
        }
    }
}
