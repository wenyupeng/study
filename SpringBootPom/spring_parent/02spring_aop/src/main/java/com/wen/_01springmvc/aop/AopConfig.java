package com.wen._01springmvc.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *
 * @author wen
 * @date 2019/5/4
 */
@Configuration
@ComponentScan("com.wen.aop")
@EnableAspectJAutoProxy//启动AspectJ支持
public class AopConfig {
}
