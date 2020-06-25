package com.lyoyang.rabbitmq.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Order {

    private String transId;

    private String accDate;

    private BigDecimal fee;

}
