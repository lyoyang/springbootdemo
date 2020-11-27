package com.lyoyang.entity;

public class AlipayResponse {

    /**
     * 必填
     */
    /*网关返回码*/
    private String code;
    /*网关返回描述*/
    private String msg;
    /*签名*/
    private String sign;
    /*商户网站唯一订单号*/
    private String out_trade_no;
    /*这笔交易在支付宝系统中的交易流水号，最长64位*/
    private String trade_no;
    /*收款支付账号对应的支付宝账号，2088开头*/
    private String seller_id;
    /*该笔订单的资金总额，rmb范围[0.01-100000000.00]，精确到小数点后两位*/
    private String total_amount;
    /**
     * 选填
     */
    /*业务返回码*/
    private String sub_code;
    /*业务返回码描述*/
    private String sub_msg;



}
