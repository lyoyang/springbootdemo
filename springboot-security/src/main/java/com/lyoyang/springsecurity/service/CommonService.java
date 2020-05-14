package com.lyoyang.springsecurity.service;


import com.lyoyang.springsecurity.dto.UserDetailsResponseDto;

import java.util.Optional;

/**
 * @author: yangbing
 * @Date: 2020/4/27 18:45
 * @Description:
 */
public interface CommonService {

    Optional<UserDetailsResponseDto> getCurrentUserDetails(boolean cache, String username);
}
