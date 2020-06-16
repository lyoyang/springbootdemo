package com.lyoyang.springbootstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author: Brian
 * @Date: 2020/6/16 18:12
 * @Description:
 */
@RestController
public class ThreadPoolController {

    private static final ExecutorService fixedThreadPool = Executors.newFixedThreadPool(100);


    @RequestMapping("/costTime")
    public String costTime() throws InterruptedException {
        long start = System.currentTimeMillis();
        List<Callable<Long>> callables = IntStream.range(0, 100).boxed().map(i -> {
            return new Callable<Long>() {
                @Override
                public Long call() throws Exception {
                    long count = 0;
                    while (true) {
                        count++;
                        if (count > 1000000000000000L) {
                            break;
                        }
                    }
                    return count;
                }
            };
        }).collect(Collectors.toList());

        List<Future<Long>> futures = fixedThreadPool.invokeAll(callables);
        String cost = "cost time:" + (System.currentTimeMillis() - start);
        return cost;
    }

}
