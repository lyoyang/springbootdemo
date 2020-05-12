package com.lyoyang.entity;

/**
 * @Auther: yangbing
 * @Date: 2018/12/7 09:37
 * @Description:
 */
public class User {

    private Integer id;
    private String name;
    private String birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
