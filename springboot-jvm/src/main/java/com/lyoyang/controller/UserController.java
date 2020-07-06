package com.lyoyang.controller;

import com.lyoyang.entity.User;
import com.lyoyang.service.CustomService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class UserController {

    private List<User> userList = new ArrayList<>();
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    @Autowired
    private ApplicationContext applicationContext;

    @Resource
    private CustomService customService;


    @RequestMapping("/getInfo")
    public String getInfo() {
        return customService.sayHello();
    }


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


    @RequestMapping("/executor")
    public Object executor() {
        Map<String, ExecutorService> beansOfType = applicationContext.getBeansOfType(ExecutorService.class);
        Map<String, Map<String, Object>> result = new HashMap<>();
        Set<Map.Entry<String, ExecutorService>> entries = beansOfType.entrySet();
        for (Map.Entry<String, ExecutorService> entry : entries) {
            ThreadPoolExecutor value = (ThreadPoolExecutor) entry.getValue();
            Map<String, Object> threadPool = new HashMap<>();
            threadPool.put("PoolSize", value.getPoolSize());
            threadPool.put("CorePoolSize", value.getCorePoolSize());
            threadPool.put("Active", value.getActiveCount());
            threadPool.put("Completed", value.getCompletedTaskCount());
            threadPool.put("Task", value.getTaskCount());
            threadPool.put("Queue", value.getQueue().size());
            threadPool.put("LargestPoolSize", value.getLargestPoolSize());
            threadPool.put("MaximumPoolSize", value.getMaximumPoolSize());
            threadPool.put("KeepAliveTime", value.getKeepAliveTime(TimeUnit.MILLISECONDS));
            threadPool.put("isShutdown", value.isShutdown());
            threadPool.put("isTerminated", value.isTerminated());
            threadPool.put("queueType", value.getQueue().getClass().getSimpleName());
            result.put(entry.getKey(), threadPool);
        }
        return result;
    }


    @Resource(name = "pool1")
    private ExecutorService pool1;


    @Resource(name = "pool2")
    private ExecutorService pool2;

    @Resource(name = "pool3")
    private ExecutorService pool3;

    @Resource(name = "pool4")
    private ExecutorService pool4;


    @RequestMapping("/doAction")
    public String doAction() {
        pool1.execute(new Worker("pool1 do work"));
        pool2.execute(new Worker("pool2 do work"));
        pool3.execute(new Worker("pool3 do work"));
        pool4.execute(new Worker("pool4 do work"));
        return "OK";
    }




    class Worker implements Runnable {
        private String msg;

        public Worker(String msg) {
            this.msg = msg;
        }

        @SneakyThrows
        @Override
        public void run() {
            log.error(msg);
            TimeUnit.SECONDS.sleep(20);
        }
    }




}
