package com.wen._01springmvc.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wen on 2019/5/18.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = applicationContext.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = applicationContext.getBean(JSR250WayService.class);
        applicationContext.close();

    }
}
