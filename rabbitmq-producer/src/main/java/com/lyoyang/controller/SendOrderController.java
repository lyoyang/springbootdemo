package com.lyoyang.controller;

import com.lyoyang.entity.Order;
import com.lyoyang.producer.OrderProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class SendOrderController {


    @Autowired
    private OrderProducer orderProducer;


    @RequestMapping("/sendOrder")
    public String sendOrder(String transId) {
        Order order = Order.builder().transId(transId)
                .fee(new BigDecimal("12345"))
                .accDate("2020-06025").build();
        orderProducer.sendOrder(order);
        return "success";
    }


}
