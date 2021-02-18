package com.lyoyang.sentinel.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Service;

@Service
public class IndexService {


    public String index() {
        return "Index Page";
    }

    public String indexBlockHandler(String name, BlockException ex){
        return "访问过快，限流降级, 请稍后重试!";
    }


}
