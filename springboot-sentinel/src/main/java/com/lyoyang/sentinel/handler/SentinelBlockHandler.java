package com.lyoyang.sentinel.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;

/**
 * 限流
 */
@Slf4j
public class SentinelBlockHandler {


    public static String block(BlockException ex) {
        log.error("服务限流", ex);
        return "服务限流，请休息会再请求";
    }


}
