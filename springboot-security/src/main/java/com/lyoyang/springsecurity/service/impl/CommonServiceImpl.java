package com.lyoyang.springsecurity.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lyoyang.springsecurity.constant.Constant;
import com.lyoyang.springsecurity.dto.UserDetailsResponseDto;
import com.lyoyang.springsecurity.entity.Manager;
import com.lyoyang.springsecurity.service.CommonService;
import com.lyoyang.springsecurity.service.ManagerService;
import com.lyoyang.springsecurity.service.RedisService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;
import java.util.Optional;

/**
 * @author: yangbing
 * @Date: 2020/4/27 18:45
 * @Description:
 */
@Service
public class CommonServiceImpl implements CommonService {

    @Resource
    private ManagerService managerService;

    @Resource
    private RedisService redisService;


    @Override
    public Optional<UserDetailsResponseDto> getCurrentUserDetails(boolean cache, String userEmail) {
        if (cache) {
            Object cacheObject = redisService.getObject(Constant.SUCCESS_LOGIN_KEY, userEmail);
            if (Objects.isNull(cacheObject)) {
                Optional<Manager> userInfo = managerService.getManagerByName(userEmail);
                if (userInfo.isPresent()) {
                    Optional<UserDetailsResponseDto> userDetailsResponseDto = getUserDetailsResponseDto(userEmail);
                    if (userDetailsResponseDto.isPresent()) {
                        redisService.putObject(Constant.SUCCESS_LOGIN_KEY, userEmail, JSON.toJSONString(userDetailsResponseDto.get()), Constant.SUCCESS_LOGIN_KEY_EXPIRES);
                    }
                    return userDetailsResponseDto;
                }
            } else {
                return Optional.of(JSONObject.parseObject(cacheObject.toString(), UserDetailsResponseDto.class));
            }
        } else {
            return getUserDetailsResponseDto(userEmail);
        }
        return Optional.empty();
    }

    private Optional<UserDetailsResponseDto> getUserDetailsResponseDto(String userName) {
        Optional<Manager> userInfo = managerService.getManagerByName(userName);
        if (userInfo.isPresent()) {
        return Optional.of(UserDetailsResponseDto.builder().userId(userInfo.get().getId()).userName(userInfo.get().getUsername())
                .enable(userInfo.get().getEnable()).userEmail(userName)
                .build());
        }
        return Optional.empty();
    }
}
