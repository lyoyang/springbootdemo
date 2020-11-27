package com.lyoyang.entity;


import lombok.Data;

@Data
public class AliPayBizContent {

    /**
     * 必填
     */
    /*商户订单号*/
    private String out_trade_no;
    /*订单名称*/
    private String subject;
    /*付款金额*/
    private String total_amount;
    /**
     * 可空
     */
    /*商品描述*/
    private String body;
    /*商品主类型 :0-虚拟类商品,1-实物类商品*/
    private String goods_type;
    /*用户付款中途退出返回商户网站的地址*/
    private String quit_url;

    /*超时时间参数*/
    private String timeout_express="10m";
    private String product_code="FAST_INSTANT_TRADE_PAY";

}
