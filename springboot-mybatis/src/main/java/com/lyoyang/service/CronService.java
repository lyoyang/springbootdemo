package com.lyoyang.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class CronService {

    private static final Logger log = LoggerFactory.getLogger(CronService.class);

    public void printInfo() throws InterruptedException {
        log.info("执行任务开始：" + System.currentTimeMillis());
        TimeUnit.SECONDS.sleep(5);
        log.info("执行任务开结束：" + System.currentTimeMillis());
    }

}
