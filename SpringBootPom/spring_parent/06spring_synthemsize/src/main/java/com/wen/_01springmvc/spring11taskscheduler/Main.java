package com.wen._01springmvc.spring11taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: wen
 * @Date: 2019/5/25 23:00
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
    }
}
