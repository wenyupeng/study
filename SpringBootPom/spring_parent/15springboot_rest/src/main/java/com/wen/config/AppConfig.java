package com.wen.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

/**
 * @Author: wen
 * @Date: 2019/6/13 22:30
 */
@Configuration
@Import(RepositoryRestMvcConfiguration.class)
public class AppConfig {
}
