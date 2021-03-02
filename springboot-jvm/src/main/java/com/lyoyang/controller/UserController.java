
package com.lyoyang.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 接收表单参数
 * @author yu 2019/10/29.
 */
@RestController
public class UserController {

    @Value("${user.domain}")
    private String domain;


    @RequestMapping("/")
    public String index() {
        System.out.println(domain);
        return "Index";
    }



}
