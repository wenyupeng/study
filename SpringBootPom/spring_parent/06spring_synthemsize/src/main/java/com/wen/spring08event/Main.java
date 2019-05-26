package com.wen.spring08event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: wen
 * @Date: 2019/5/19 11:38
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello application event");
        context.close();

    }
}
