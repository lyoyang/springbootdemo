package com.lyoyang.springsecurity.exception;

import com.lyoyang.springsecurity.enums.ResponseEnum;
import lombok.Data;

import java.io.Serializable;

@Data
public class BaseException extends RuntimeException implements Serializable {

    private String errCode;
    private String errMsg;

    public BaseException(String errCode, String errMsg) {
        super(errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public BaseException(ResponseEnum responseEnum) {
        super(responseEnum.getMessage());
        this.errCode = responseEnum.getCode();
        this.errMsg = responseEnum.getMessage();
    }

}
