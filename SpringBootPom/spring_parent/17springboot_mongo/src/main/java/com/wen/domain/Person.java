package com.wen.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * @Author: wen
 * @Date: 2019/6/16 19:53
 */
@Document//注解映射领域模型和MongoDB的文档
public class Person {
    @Id//注解属性为文档的id
    private String id;
    private String name;
    private Integer age;
    @Field("loc")//注解此属性在文档中的名称为locs，locations属性将以数组形式存在当前数据记录中
    private Collection<Location> locations=new LinkedHashSet<>();

    public Person() {
        super();
    }

    public Person(String name, Integer age) {
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

    public Collection<Location> getLocations() {
        return locations;
    }

    public void setLocations(Collection<Location> locations) {
        this.locations = locations;
    }
}
