package com.lyoyang.filter;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


@WebFilter(filterName="logFilter", urlPatterns="/*")
public class LogFilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        ServletRequest requestWrapper = new MyRequestWrapper((HttpServletRequest) servletRequest);
        filterChain.doFilter(requestWrapper, servletResponse);
    }

}
