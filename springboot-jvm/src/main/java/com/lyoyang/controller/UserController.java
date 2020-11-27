package com.lyoyang.controller;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.response.AlipayTradePagePayResponse;
import com.lyoyang.entity.AliPayBizContent;
import com.lyoyang.entity.User;
import com.lyoyang.properties.AliPayProperties;
import com.lyoyang.utils.AlipayUtil;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class UserController {

    @Resource
    private AliPayProperties aliPayProperties;

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
    public String hello(HttpServletRequest request, HttpServletResponse response) {
        String privateKey = aliPayProperties.getPrivateKey();
        System.out.println(privateKey);
        return "hello";
    }


    @RequestMapping("/sayHello")
    public String sayHello(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        String id = request.getSession().getId();
        System.out.println("sessionId=" + id);
        return "sayHello";
    }


    @RequestMapping("/aliNotify")
    public String aliNotify() {
        return "aliNotify";
    }


    @SneakyThrows
    @RequestMapping("/pay")
    public String pay() {
        AliPayBizContent aliPayBizContent = new AliPayBizContent();
        aliPayBizContent.setOut_trade_no("20205435445446756756");
        aliPayBizContent.setSubject("华为手机");
        aliPayBizContent.setTotal_amount("10.00");
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl("http://localhost:8089/aliNotify"); //页面跳转同步通知页面路径
        alipayRequest.setBizContent(JSON.toJSONString(aliPayBizContent));
        AlipayTradePagePayResponse response = AlipayUtil.getAlipayClient().pageExecute(alipayRequest);
        if (response.isSuccess()) {
            return response.getBody();
        }
        return "失败";
    }



}
