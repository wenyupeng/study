package com.wen._01springmvc.demo01;

import com.wen._01springmvc.demo01.bean.UseFunctionService;
import com.wen._01springmvc.demo01.config.DiConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wen on 2019/4/28.
 */

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.SayHello("wen"));
        context.close();
    }
}
