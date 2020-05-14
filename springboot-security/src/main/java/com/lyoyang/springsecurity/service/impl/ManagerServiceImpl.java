package com.lyoyang.springsecurity.service.impl;

import com.lyoyang.springsecurity.entity.Manager;
import com.lyoyang.springsecurity.entity.ManagerExample;
import com.lyoyang.springsecurity.mapper.ManagerMapper;
import com.lyoyang.springsecurity.service.ManagerService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @author: Brian
 * @Date: 2020/5/14 19:24
 * @Description:
 */
@Service
public class ManagerServiceImpl implements ManagerService {

    @Resource
    private ManagerMapper managerMapper;

    @Override
    public Optional<Manager> getManagerByName(String userName) {
        ManagerExample example = new ManagerExample();
        example.createCriteria().andUsernameEqualTo(userName);
        List<Manager> managers = managerMapper.selectByExample(example);
        return CollectionUtils.isNotEmpty(managers) ? Optional.of(managers.get(0)) : Optional.empty();
    }
}
