package com.wen._01springmvc.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wen on 2019/5/4.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingleService s1 = context.getBean(DemoSingleService.class);
        DemoSingleService s2 = context.getBean(DemoSingleService.class);
        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);
        System.out.println("s1 与 s2 是否相等 "+s1.equals(s2));
        System.out.println("p1 与 p2 是否相等 " +p1.equals(p2));
    }
}
