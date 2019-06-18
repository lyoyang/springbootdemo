package com.lyoyang.springbootstart.controller;


import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.lyoyang.springbootstart.entity.User;
import com.lyoyang.springbootstart.utils.MatrixToImageWriterWithLogo;
import com.lyoyang.springbootstart.utils.MvcMessage;
import com.lyoyang.springbootstart.utils.MvcResponse;
import com.lyoyang.springbootstart.utils.QRCodeUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @Value("${stu.name}")
    private String myName;


    @RequestMapping("/")
    public String index() {
//        int i = 1/0;
        return "hello springboot";
    }

    @RequestMapping("/getUser")
    public Map<Integer,User> getUser() {
        HashMap<String, User> userMap = Maps.newHashMap();
        ArrayList<User> list = Lists.newArrayList();
//        User u1 = new User(1, 23, "jim", "female");
//        User u2 = new User(2, 24, "bob", "male");
//        User u3 = new User(3, 33, "mary", "male");
//        User u4 = new User(4, 23, "gulu", "male");
//        User u5 = new User(5, 23, "coco", "female");
//        list.add(u1);
//        list.add(u2);
//        list.add(u3);
//        list.add(u4);
//        list.add(u5);
        return Maps.uniqueIndex(list, User::getId);
    }

    @RequestMapping("/getQrcode")
    public void getQrcode(HttpServletRequest request, HttpServletResponse response) {
        String longUrl;
        try {
            longUrl = "https://www.baidu.com";
            // 转换成短url
            // 生成二维码
            BitMatrix qRcodeImg = QRCodeUtil.generateQRCodeStream(longUrl, response);
            // 将二维码输出到页面中
            MatrixToImageWriter.writeToStream(qRcodeImg, "png", response.getOutputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @RequestMapping("/getQrcodeWithLogo")
    public void getQrcodeWithLogo(HttpServletRequest request, HttpServletResponse response, String path) {
        String longUrl;
        try {
            longUrl = "https://www.baidu.com";
            // 转换成短url
            // 生成二维码
            MatrixToImageWriterWithLogo.encode(longUrl, 512, 512, "D://qr.png", "D://" + path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/download")
    public void download(HttpServletResponse response) {
        String destPath = "D://code.jpg";
        try(InputStream in = new FileInputStream(destPath);
            OutputStream os = response.getOutputStream();) {
            response.setHeader("Content-Disposition",
                    "attachment;fileName=" + "headPic.jpg");
            byte[] bytes = new byte[1024];
            ServletOutputStream outputStream = response.getOutputStream();
            while (in.read(bytes) != -1) {
                //切换成读取数据的模式
                outputStream.write(bytes);
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/getParam")
    public String getParam(@RequestBody String id) {
        return id;
    }


    @RequestMapping("/validateTest")
    public MvcResponse validateTest(@Valid User user, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            for(ObjectError objectError : bindingResult.getAllErrors()) {
                return new MvcResponse(MvcResponse.CODE_FAILURE, objectError.getDefaultMessage());
            }
        }
        return new MvcResponse(MvcMessage.CODE_SUCCESS);
    }



}
