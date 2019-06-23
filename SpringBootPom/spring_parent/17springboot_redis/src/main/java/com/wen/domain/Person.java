package com.wen.domain;

import javax.print.attribute.standard.PrinterURI;
import java.io.Serializable;

/**
 * @Author: wen
 * @Date: 2019/6/16 23:40
 */
//Jackson做序列化必须用时间序列化接口
public class Person implements Serializable {

    private static final long serialVersionUID = -244623701812878156L;

    private String id;
    private String name;
    private Integer age;

    public Person() {
        super();
    }

    public Person(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
