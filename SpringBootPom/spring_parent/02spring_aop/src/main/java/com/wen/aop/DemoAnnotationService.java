package com.wen.aop;

import com.wen.annotation.Action;
import org.springframework.stereotype.Service;

/**
 * Created by wen on 2019/4/29.
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add(){}
}
