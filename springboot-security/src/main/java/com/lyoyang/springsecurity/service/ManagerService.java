package com.lyoyang.springsecurity.service;

import com.lyoyang.springsecurity.entity.Manager;

import java.util.Optional;

/**
 * @author: Brian
 * @Date: 2020/5/14 19:24
 * @Description:
 */
public interface ManagerService {
    Optional<Manager> getManagerByName(String userName);

}
