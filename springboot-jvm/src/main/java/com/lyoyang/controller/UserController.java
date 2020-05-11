package com.lyoyang.controller;

import com.lyoyang.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class UserController {

    private List<User> userList = new ArrayList<>();
    private Object lock1 = new Object();
    private Object lock2 = new Object();


    //堆内存溢出
    @RequestMapping("/addUser")
    public void addUser() {
        while (true) {
            String uuid = UUID.randomUUID().toString();
            userList.add(new User(uuid, uuid + ":user"));
        }
    }


    //死锁
    @RequestMapping("/deadLock")
    public String deadLock() {
        new Thread(()->{
            synchronized (lock1){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("Thread1 over");
                }
            }
        }).start();
        new Thread(()->{
            synchronized (lock2){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("Thread1 over");
                }
            }
        }).start();
        return "dead lock";
    }


    @RequestMapping("/hello")
    public String hello() {
        int a = 1;
        int b = 2;
        int c = 3;
        return "hello";
    }



}
