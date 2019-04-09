package com.lyoyang.springbootlianshou.server;

import org.springframework.beans.factory.InitializingBean;

/**
 * @Auther: yangbing
 * @Date: 2019/3/4 20:06
 * @Description:
 */
public class NettyServer implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        start();
    }

    public void  start() {
        System.out.println("hello netty");
    }



}
