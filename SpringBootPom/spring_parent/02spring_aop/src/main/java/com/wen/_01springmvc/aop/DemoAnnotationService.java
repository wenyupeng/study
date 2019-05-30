package com.wen._01springmvc.aop;

import com.wen._01springmvc.annotation.Action;
import org.springframework.stereotype.Service;

/**
 * Created by wen on 2019/4/29.
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add(){}
}
