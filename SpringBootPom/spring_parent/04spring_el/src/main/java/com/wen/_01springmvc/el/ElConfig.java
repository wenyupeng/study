package com.wen._01springmvc.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;


/**
 * Created by wen on 2019/5/4.
 */
@Configuration
@ComponentScan("com.wen.el")
@PropertySource("classpath:test.properties")
public class ElConfig {
    @Value("I Love You")//普通字符串
    private String normal;
    @Value("#{systemProperties['os.name']}")//操作系统属性
    private String osName;
    @Value("#{T(java.lang.Math).random()*100.0}")//表达式结果
    private double randomNumber;
    @Value("#{demoService.another}")//其他bean属性
    private String fromAnother;
    @Value("classpath:test.properties")//文件资源
    private Resource testFile;
    @Value("http://www.baidu.com")//网址资源
    private Resource testUrl;
    @Value("${book.name}")//注入配置文件
    private String bookName;
    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() {
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
