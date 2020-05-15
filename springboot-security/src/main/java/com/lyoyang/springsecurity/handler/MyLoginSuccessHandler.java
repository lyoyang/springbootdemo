package com.lyoyang.springsecurity.handler;

import com.alibaba.fastjson.JSONObject;
import com.lyoyang.springsecurity.dto.LoginRespDto;
import com.lyoyang.springsecurity.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: Brian
 * @Date: 2020/5/14 16:05
 * @Description:
 */
@Component
public class MyLoginSuccessHandler implements AuthenticationSuccessHandler {

    @Resource
    private JwtTokenUtil jwtTokenUtil;

    @Value("${user.token.prefix}")
    private String tokenPrefix;


    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        response.setContentType("application/json;charset=UTF-8");
        response.setContentType("application/json;charset=UTF-8");
        response.setStatus(200);
        String jwt = jwtTokenUtil.generateToken(authentication);
        request.getSession().setAttribute(tokenPrefix, jwt);
        LoginRespDto loginRespDto = LoginRespDto.builder().accessToken(jwt).build();
        PrintWriter writer = response.getWriter();
        writer.write(JSONObject.toJSONString(ResponseEntity.ok(loginRespDto)));
    }
}
