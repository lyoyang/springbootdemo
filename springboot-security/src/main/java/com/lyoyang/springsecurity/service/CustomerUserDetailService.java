package com.lyoyang.springsecurity.service;

import com.lyoyang.springsecurity.entity.Manager;
import com.lyoyang.springsecurity.entity.ManagerExample;
import com.lyoyang.springsecurity.mapper.ManagerMapper;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerUserDetailService implements UserDetailsService {

    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ManagerExample example = new ManagerExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<Manager> managers = managerMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(managers)) {
            throw new UsernameNotFoundException("用户不存在");
        }
        Manager manager = managers.get(0);
        manager.setAuthorities(AuthorityUtils.commaSeparatedStringToAuthorityList(manager.getRoles()));
        return manager;
    }
}
