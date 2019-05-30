package com.wen.spring13annotation;

import org.springframework.stereotype.Service;

/**
 * @Author: wen
 * @Date: 2019/5/26 10:54
 */
@Service
public class DemoService {
    public void outputResult() {
        System.out.println("从组合注解配置照样获取bean");
    }

}
