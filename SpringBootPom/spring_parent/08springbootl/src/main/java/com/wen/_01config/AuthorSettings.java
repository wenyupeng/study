package com.wen._01config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author: wen
 * @Date: 2019/6/1 14:41
 */
@Component//声明是一个组件
@ConfigurationProperties(prefix = "author")//将properties文件中的属性和Bean关联
//spring boot1.5以上版本@ConfigurationProperties取消location,使用PropertySource替代
@PropertySource(value = "classpath:/config/author.properties")
public class AuthorSettings {
    private String Name;
    private Long age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
