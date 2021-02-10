package com.lyoyang.utils;

import org.springframework.context.ConfigurableApplicationContext;

public class BeanUtils {
    public static ConfigurableApplicationContext applicationContext;
    //定义一个获取已经实例化bean的方法
    public static <T> T getBean(Class<T> c){
        return applicationContext.getBean(c);
    }

    public static Object getBean(String beanName){
        Object bean = applicationContext.getBean(beanName);
        return bean;
    }

}
