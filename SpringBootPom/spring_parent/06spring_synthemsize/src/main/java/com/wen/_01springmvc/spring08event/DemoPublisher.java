package com.wen._01springmvc.spring08event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Author: wen
 * @Date: 2019/5/19 11:35
 */
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationContext;//注入context用于发布事件

    public void publish(String msg){
        applicationContext.publishEvent(new DemoEvent(this  ,msg));
    }
}
