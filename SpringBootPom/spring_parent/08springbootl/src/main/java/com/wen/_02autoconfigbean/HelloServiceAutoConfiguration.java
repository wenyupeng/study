package com.wen._02autoconfigbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: wen
 * @Date: 2019/6/2 23:11
 */
@Configuration
@EnableConfigurationProperties(HelloServiceProperties.class)//安全加载配置的属性
@ConditionalOnClass(HelloService.class)//当缺少特定class时加载
@ConditionalOnProperty(prefix = "hello", value = "enabled", matchIfMissing = true)//prefix 前缀 value 属性名称的值 matchIfMissing 当属性不存在的时候是否报错
public class HelloServiceAutoConfiguration {
    @Autowired
    private HelloServiceProperties helloServiceProperties;

    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService() {
        HelloService helloService = new HelloService();
        helloService.setMsg(helloServiceProperties.getMsg());
        return helloService;
    }
}
