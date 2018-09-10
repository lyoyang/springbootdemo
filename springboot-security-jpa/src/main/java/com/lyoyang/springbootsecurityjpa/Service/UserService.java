package com.lyoyang.springbootsecurityjpa.Service;

import com.google.common.collect.Lists;
import com.lyoyang.springbootsecurityjpa.entity.Role;
import com.lyoyang.springbootsecurityjpa.entity.User;
import com.lyoyang.springbootsecurityjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(s);
        Role role = new Role();
        if(user == null) {
            throw new UsernameNotFoundException("用户不存在");
        }
        return user;
    }


    public Long saveUser(User user) {
        User newUser = userRepository.save(user);
        return newUser.getId();
    }


}
