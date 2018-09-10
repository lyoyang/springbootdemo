package com.lyoyang.springbootsecurityjpa.repository;

import com.lyoyang.springbootsecurityjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);


}
