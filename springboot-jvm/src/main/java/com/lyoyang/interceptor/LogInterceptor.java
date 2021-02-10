package com.lyoyang.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Slf4j
public class LogInterceptor implements HandlerInterceptor {

    private static final String REQUEST_START_TIME = "request_start_time";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURL().toString();
        String method = request.getMethod();
        String query = request.getQueryString();
        log.info("request_receive: url:{},method:{},query:{}", url, method, query);
        request.setAttribute(REQUEST_START_TIME, System.currentTimeMillis());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        long startTime = (long) request.getAttribute(REQUEST_START_TIME);
        long endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        log.debug("request_end: {}, cost time:{}ms",request.getRequestURL(), interval);
    }



}
