package com.lyoyang.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.response.AlipayTradePagePayResponse;
import com.lyoyang.entity.AliPayBizContent;
import com.lyoyang.entity.User;
import com.lyoyang.properties.AliPayProperties;
import com.lyoyang.utils.AlipayUtil;
import lombok.SneakyThrows;
import org.fluentd.logger.FluentLogger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * 接收表单参数
 * @author yu 2019/10/29.
 */
@RestController
public class UserController {

    @Resource
    private AliPayProperties aliPayProperties;

    private List<User> userList = new ArrayList<>();
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    private static FluentLogger LOG = FluentLogger.getLogger("docker.test", "localhost", 24224);


//    //堆内存溢出
//    @RequestMapping("/addUser")
//    public void addUser() {
//        while (true) {
//            String uuid = UUID.randomUUID().toString();
//            userList.add(new User(uuid, uuid + ":user"));
//        }
//    }


    //死锁
//    @RequestMapping("/deadLock")
//    public String deadLock() {
//        new Thread(()->{
//            synchronized (lock1){
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                synchronized (lock2) {
//                    System.out.println("Thread1 over");
//                }
//            }
//        }).start();
//        new Thread(()->{
//            synchronized (lock2){
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                synchronized (lock1) {
//                    System.out.println("Thread1 over");
//                }
//            }
//        }).start();
//        return "dead lock";
//    }


    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response, String name) {
        return "hello";
    }


    @RequestMapping("/hello2")
    public String hello2() {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "userA");
        data.put("age", "32");
        data.put("email", "userA@23324324.com");
        LOG.log("java", data);
        return "hello";
    }

    @RequestMapping("/hello3")
    public String hello2(String name, MultipartFile multipartFile) {
        return "hello";
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
