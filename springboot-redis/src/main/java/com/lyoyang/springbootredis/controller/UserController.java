package com.lyoyang.springbootredis.controller;

import com.lyoyang.springbootredis.entity.User;
import com.lyoyang.springbootredis.service.RedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Executors;

@RestController
@RequestMapping("/user")
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);
    private static final String KEY = "MCH_FEE";
    private static int count = 0;

    @Autowired
    private RedisService redisService;

    @RequestMapping("/getUserById")
    public User getUserById(Integer id){
        logger.error("错误日志测试记录哈哈哈哈哈哈");
        User user = redisService.getUserById(id);
        return user;
    }

    @RequestMapping("/saveUser")
    public String saveUser(User user) {
            count = count + 1;
//        redisService.saveUser(user);
//        for(int i = 0; i<10; i++) {
//            new Thread(new MyThread(i)).start();
//        }

        boolean lock = redisService.lock(KEY, 10, 3, 3000);
        if(lock) {
            System.out.println(Thread.currentThread() + "获得锁");
            try {
                Thread.sleep(1000);
                redisService.releaseLock(KEY);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("请求次数：" + count);
        return "success";
    }
    class MyThread implements Runnable {

        private Integer id;
        public MyThread(Integer id) {
            this.id = id;
        }

        @Override
        public void run() {
            boolean lock = redisService.lock(KEY, 2, 3, 3000);
            if(lock) {
                System.out.println(Thread.currentThread() + "获得锁");
                try {
                    Thread.sleep(1000);
                    redisService.releaseLock(KEY);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
