package com.lyoyang.springsecurity.filter;

import com.lyoyang.springsecurity.exception.VerificationCodeException;
import com.lyoyang.springsecurity.handler.MyAuthenticationFailureHandler;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class VerificationCodeFilter extends OncePerRequestFilter {

    private MyAuthenticationFailureHandler handler = new MyAuthenticationFailureHandler();


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if (!"/doLogin".equals(request.getRequestURI())) {
            filterChain.doFilter(request, response);
        } else {
            try {
                verificationCode(request);
                filterChain.doFilter(request, response);
            } catch (VerificationCodeException e) {
                handler.onAuthenticationFailure(request, response, e);
            }
        }
    }

    private void verificationCode(HttpServletRequest request) throws VerificationCodeException {
        String requestCode = request.getParameter("captcha");
        HttpSession session = request.getSession();
        String saveCode = (String) session.getAttribute("captcha");
        if (!StringUtils.isEmpty(saveCode)) {
            session.removeAttribute("captcha");
        }
        if (StringUtils.isEmpty(requestCode) || StringUtils.isEmpty(saveCode)
                || !saveCode.equals(requestCode)) {
            throw new VerificationCodeException();
        }
    }
}
