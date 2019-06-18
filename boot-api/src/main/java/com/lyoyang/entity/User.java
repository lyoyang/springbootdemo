package com.lyoyang.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    @NotNull(message = "id不能为空")
    private Integer id;
    @NotBlank(message = "用户名不能为空")
    private String username;
    private Date birthday;
    private String gender;
    private String address;
    @NotBlank(message = "密码不能为空")
    @Length(min = 6, message = "密码长度至少6位")
    private String password;
    private Integer age;



}
