package com.lyoyang.springbootwebflux.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author: Brian
 * @Date: 2020/5/19 16:34
 * @Description:
 */
@Data
@Builder
public class UserModel {

    private String id;

    private String name;

}
