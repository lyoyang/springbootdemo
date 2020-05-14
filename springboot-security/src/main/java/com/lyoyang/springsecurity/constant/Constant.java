package com.lyoyang.springsecurity.constant;


public interface Constant {

    /*** 登录成功用户存入缓存 */
    String SUCCESS_LOGIN_KEY = "sgscf:login:";
    /*** 登录成功用户存入缓存過期時間 */
    long SUCCESS_LOGIN_KEY_EXPIRES = 3600L;

    /** HEADER_STRING */
    String HEADER_STRING = "Bearer";

    String VERIFY_CODE = "sgscfVerifyCode";

}
