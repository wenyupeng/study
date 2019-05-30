package com.wen._01springmvc.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wen on 2019/5/4.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig resourceService = context.getBean(ElConfig.class);
        resourceService.outputResource();
        context.close();
    }
}
