package com.wen.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author wen
 * @date 2019/5/18
 */
@Configuration
@ComponentScan("com.wen.prepost")
public class PrePostConfig {
    @Bean(initMethod = "init",destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
