package com.wen._01springmvc.spring09aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: wen
 * @Date: 2019/5/19 11:52
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.outputResult();
        context.close();
    }
}
