package com.lyoyang.springsecurity.config;

import com.alibaba.fastjson.JSONObject;
import com.lyoyang.springsecurity.entity.Manager;
import com.lyoyang.springsecurity.utils.GetRequestJsonUtils;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomAuthenticationFilter extends UsernamePasswordAuthenticationFilter {


    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        if (request.getContentType().equals(MediaType.APPLICATION_JSON_UTF8_VALUE)
                || request.getContentType().equals(MediaType.APPLICATION_JSON_VALUE)) {



            UsernamePasswordAuthenticationToken authRequest = null;
            try {
                String jsonString = GetRequestJsonUtils.getPostRequestJsonString(request);
                Manager selfUserDetails = JSONObject.parseObject(jsonString, Manager.class);
                authRequest = new UsernamePasswordAuthenticationToken(
                        selfUserDetails.getUsername(), selfUserDetails.getPassword());
            } catch (Exception e) {
                e.printStackTrace();
                authRequest = new UsernamePasswordAuthenticationToken(
                        "", "");
            } finally {
                setDetails(request, authRequest);
                return this.getAuthenticationManager().authenticate(authRequest);
            }
        }
        //transmit it to UsernamePasswordAuthenticationFilter
        else {
            return super.attemptAuthentication(request, response);
        }
    }
}
