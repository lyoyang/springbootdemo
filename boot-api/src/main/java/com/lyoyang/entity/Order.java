package com.lyoyang.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
public class Order implements Serializable {

    private String transId;

    private String accDate;

    private BigDecimal fee;

}
