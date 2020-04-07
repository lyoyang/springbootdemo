package com.lyoyang.cache.service;

import com.lyoyang.cache.dao.DeptMapper;
import com.lyoyang.cache.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheManager = "deptCacheManager", cacheNames = "dept")
public class DeptService {


    @Autowired
    private DeptMapper deptMapper;

    @Cacheable
    public Department getDeptById(Integer id) {
        return deptMapper.getDeptById(id);
    }


}
