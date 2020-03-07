package com.lyoyang.springbootstart.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * UserInfo: Z
 * Date: 16-7-9
 * Time: 下午12:45
 * To change this template use File | Settings | File Templates.
 */
@Data
public class MvcResponse {

    public static final String CODE_SUCCESS = "0"; // 交易成功
    public static final String CODE_FAILURE_SESSION_TIMEOUT = "2";//会话超时
    public static final String CODE_FAILURE = "1"; //交易失败
    public static final String CODE_FAILURE_NO_PERMISSION = "3";//安全拦截

    private Head head;
    private Object body;

    public MvcResponse() {
        this.head = new Head();
    }

    public MvcResponse(MvcMessage message) {
        this.head = new Head(message.getCode(), message.getDesc());
    }

    public MvcResponse(MvcMessage message, Object data) {
        this.head = new Head(message.getCode(), message.getDesc());
        this.body = data;
    }

    public MvcResponse(String respCode, String respMsg) {
        this.head = new Head(respCode, respMsg);

    }

    public MvcResponse(String respCode, String respMsg, Object data) {
        this(respCode, respMsg);
        this.body = data;
    }



    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Head {
        /**
         * 返回码
         */
        private String rd;
        /**
         * 返回消息
         */
        private String rm;
    }

}
