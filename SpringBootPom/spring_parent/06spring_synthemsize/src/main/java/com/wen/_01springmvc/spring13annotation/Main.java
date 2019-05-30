package com.wen._01springmvc.spring13annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: wen
 * @Date: 2019/5/26 11:10
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputResult();
        context.close();
    }
}
