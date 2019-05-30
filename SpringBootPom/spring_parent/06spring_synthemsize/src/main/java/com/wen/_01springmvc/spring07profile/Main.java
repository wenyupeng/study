package com.wen._01springmvc.spring07profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @Author: wen
 * @Date: 2019/5/19 10:25
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        ConfigurableEnvironment environment = context.getEnvironment();
        environment.setActiveProfiles("prod");//设置活动的Profile
        context.register(ProfileConfig.class);//后置注册bean配置类
        context.refresh();//刷新容器

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContext());
        context.close();
    }
}
