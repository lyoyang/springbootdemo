package com.lyoyang.sentinel.handler;

import lombok.extern.slf4j.Slf4j;

/**
 * 服务降级
 */
@Slf4j
public class SentinelFallBackHandler {


    public static String fallback(Throwable t) {
        log.error("服务降级", t);
        return "网络异常，请稍后再次请求";
    }


}
