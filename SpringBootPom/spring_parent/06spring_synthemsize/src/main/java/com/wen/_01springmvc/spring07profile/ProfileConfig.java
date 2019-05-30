package com.wen._01springmvc.spring07profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


/**
 * @author wen
 * @date 2019/5/19
 */
@Configuration
public class ProfileConfig {
    @Bean
    @Profile("dev")//实例化devDemoBean
    public DemoBean demoBean(){
        return new DemoBean("from development spring07profile");
    }

    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean(){
        return new DemoBean("from production spring07profile");
    }
}
