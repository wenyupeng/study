package com.wen._01springmvc.spring07profile;

/**
 * Created by wen on 2019/5/19.
 */
public class DemoBean {
    private String context;

    public DemoBean(String context) {
        super();
        this.context = context;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
