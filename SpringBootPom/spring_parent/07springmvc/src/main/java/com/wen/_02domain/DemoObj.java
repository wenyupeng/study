package com.wen._02domain;

/**
 * @Author: wen
 * @Date: 2019/5/26 22:48
 */
public class DemoObj {
    private long id;
    private String name;

    public DemoObj() {
        super();
    }

    public DemoObj(long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
