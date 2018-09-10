package com.lyoyang.springbootlianshou.exception;


/**
 * @author
 */
public class UserNotExistException extends RuntimeException {

    public UserNotExistException() {
        super("用户不存在");
    }
}
