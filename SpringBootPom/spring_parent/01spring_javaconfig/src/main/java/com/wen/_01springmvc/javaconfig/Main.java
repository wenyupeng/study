package com.wen._01springmvc.javaconfig;

import com.wen._01springmvc.javaconfig.bean.UseFunctionService;
import com.wen._01springmvc.javaconfig.config.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wen on 2019/4/28.
 */

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.SayHello("wen"));
        context.close();
    }
}
