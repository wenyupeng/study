package com.wen._01springmvc.spring11taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author: wen
 * @Date: 2019/5/25 22:57
 */
@Configuration
@ComponentScan(basePackages = {"com.wen.spring11taskscheduler"})
@EnableScheduling//注解开启对任务计划的支持
public class TaskSchedulerConfig {
}
