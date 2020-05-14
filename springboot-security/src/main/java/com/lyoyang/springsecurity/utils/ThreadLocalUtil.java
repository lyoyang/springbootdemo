package com.lyoyang.springsecurity.utils;

import com.lyoyang.springsecurity.dto.UserDetailsResponseDto;
import com.lyoyang.springsecurity.enums.ResponseEnum;
import com.lyoyang.springsecurity.exception.BaseException;

public class ThreadLocalUtil {
    private static ThreadLocal<UserDetailsResponseDto> currentUserLocal = new ThreadLocal<>();

    public static UserDetailsResponseDto getCurrentUserDetails() {
        UserDetailsResponseDto userDetailsResponseDto = currentUserLocal.get();
        if (userDetailsResponseDto == null) {
            throw new BaseException(ResponseEnum.LOGIN_LOSE);
        }
        return userDetailsResponseDto;
    }

    public static void setCurrentUserDetails(UserDetailsResponseDto userDetails) {
        currentUserLocal.remove();
        currentUserLocal.set(userDetails);
    }

}
