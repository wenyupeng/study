package com.wen.domain;

import javax.validation.constraints.Size;

/**
 * @Author: wen
 * @Date: 2019/6/19 23:55
 */
public class Person {
    //JSR-303规范数据
    @Size(max = 4, min = 2)
    private String name;

    private int age;
    private String nation;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
