package com.wen.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by wen on 2019/5/8.
 */
public class JSR250WayService {
    @PostConstruct//在构造函数执行完后执行
    public void init(){
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }
    @PreDestroy//在bean销毁的时候执行
    public void destroy(){
        System.out.println("jsr250-destroy-method");
    }
}
