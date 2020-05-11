package com.lyoyang.springbootlianshou.controller;

import com.lyoyang.springbootlianshou.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {

//    @ExceptionHandler(UserNotExistException.class)
//    @ResponseBody
//    public Map<String,Object> handlerException() {
//        HashMap<String, Object> maps = new HashMap<>();
//        maps.put("code","567");
//        maps.put("msg","test exception");
//        maps.put("data","my data");
//        return maps;
//    }

    @ExceptionHandler(UserNotExistException.class)
    public String handlerException(HttpServletRequest request) {
        HashMap<String, Object> maps = new HashMap<>();
        request.setAttribute("javax.servlet.error.status_code",400);
        maps.put("code","567");
        maps.put("msg","test exception");
        maps.put("data","my data");
        request.setAttribute("ext",maps);
        return "forward:/error";
    }
}
