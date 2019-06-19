package com.lyoyang.springbootstart.entity;

/**
 * @Auther: yangbing
 * @Date: 2019/5/29 17:08
 * @Description:
 */
public class StudentDto {

    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
