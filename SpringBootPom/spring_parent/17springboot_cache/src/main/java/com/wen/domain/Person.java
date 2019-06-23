package com.wen.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Author: wen
 * @Date: 2019/6/15 20:26
 */
@Entity
//sonplugin用的是java的内审机制.被管理的pojo会加入一个hibernateLazyInitializer属性,jsonplugin会对hibernateLazyInitializer拿出来操作,并读取里面一个不能被反射操作的属性就产生了异常
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer age;
    private String address;

    public Person() {
        super();
    }

    public Person(Long id,String name, Integer age, String address) {
        this.id=id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
