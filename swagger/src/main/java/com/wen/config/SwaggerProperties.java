package com.wen.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by wen on 2018/12/19.
 */
@ConfigurationProperties(prefix = "swagger")
/**
 * lombok自动提供getter和setter方法
 */
@Data
public class SwaggerProperties {
    private Boolean enable;
    private String basePackage="";
    private String title="Spring Boot 中使用Swagger2构建RESTful APIs";
    private String description="学习swagger2";
    private String termsOfServiceUrl="https://jetbrains.org.cn/";
    private String contact="wen";
    private String version="1.0";

}
