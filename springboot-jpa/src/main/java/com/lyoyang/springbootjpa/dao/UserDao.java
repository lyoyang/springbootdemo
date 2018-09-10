package com.lyoyang.springbootjpa.dao;

import com.lyoyang.springbootjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {

    User findByUsername(String username);



}
