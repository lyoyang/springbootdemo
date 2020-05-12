package com.lyoyang.springsecurity.config;

import com.lyoyang.springsecurity.exception.VerificationCodeException;
import com.lyoyang.springsecurity.service.CustomerUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.session.FindByIndexNameSessionRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class MyAuthenticationProvider extends DaoAuthenticationProvider {


    @Autowired
    private FindByIndexNameSessionRepository sessionRepository;

    public MyAuthenticationProvider(PasswordEncoder passwordEncoder, CustomerUserDetailService customerUserDetailService) {
        this.setUserDetailsService(customerUserDetailService);
        this.setPasswordEncoder(passwordEncoder);
    }

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        MyWebAuthenticationDetails details = (MyWebAuthenticationDetails) authentication.getDetails();
        if (!details.isVerificationCodeRight()) {
            throw new VerificationCodeException();
        }
        super.additionalAuthenticationChecks(userDetails, authentication);
    }
}
