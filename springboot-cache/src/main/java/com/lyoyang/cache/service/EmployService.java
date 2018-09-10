package com.lyoyang.cache.service;

import com.lyoyang.cache.dao.EmplMapper;
import com.lyoyang.cache.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "empl",cacheManager = "emplCacheManager")
public class EmployService {

    @Autowired
    private EmplMapper emplMapper;

//    @Cacheable(value = "empl",keyGenerator = "myKeyGenerator",condition = "#id gt 1", unless = "#id eq 30")
    @Cacheable
    public Employee getEmplById(Integer id) {
        return emplMapper.getEmplById(id);
    }


    @CachePut(key = "#result.id")
    public Employee updateEmpl(Employee employee) {
        emplMapper.updateEmpl(employee);
        return employee;
    }


    @CacheEvict()
    public void delEmpl(Integer id) {
//        emplMapper.delEmpl(id);
        System.out.println("del empl:" + id);
    }




}
