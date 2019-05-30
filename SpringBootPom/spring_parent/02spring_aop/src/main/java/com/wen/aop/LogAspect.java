package com.wen.aop;

import com.wen.annotation.Action;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by wen on 2019/4/29.
 */
@Aspect//声明一个切面
@Component
public class LogAspect {
    @Pointcut("@annotation(com.wen.annotation.Action)")//声明切点
    public void annotationPointCut(){}

    @After("annotationPointCut()")//声明建言，使用切点
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截 "+action.name());//通过反射获取注解内容
    }

    @Before("execution(* com.wen.aop.DemoMethodService.*(..))")//调用任意此路径下的方法（任意参数）
    public void before(JoinPoint jointPoint){
        MethodSignature signature= (MethodSignature) jointPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则方式拦截，"+method.getName());
    }
}
