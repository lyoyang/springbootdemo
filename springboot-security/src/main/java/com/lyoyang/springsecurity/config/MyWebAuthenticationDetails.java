package com.lyoyang.springsecurity.config;

import org.apache.commons.lang.StringUtils;
import org.springframework.security.web.authentication.WebAuthenticationDetails;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class MyWebAuthenticationDetails extends WebAuthenticationDetails {

    private boolean isVerificationCodeRight;

    public boolean isVerificationCodeRight() {
        return isVerificationCodeRight;
    }


    public MyWebAuthenticationDetails(HttpServletRequest request) {
        super(request);
        String imageCode = request.getParameter("captcha");
        HttpSession session = request.getSession();
        String savedImageCode = (String) session.getAttribute("captcha");
        if (!StringUtils.isEmpty(savedImageCode)) {
            session.removeAttribute("captcha");
            if (!StringUtils.isEmpty(imageCode) && imageCode.equals(savedImageCode)) {
                this.isVerificationCodeRight = true;
            }
        }
    }
}
