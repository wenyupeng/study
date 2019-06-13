package com.wen;

import com.wen._01config.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wen
 * @Date: 2019/5/30 23:30
 */
@RestController
@SpringBootApplication//开启自动配置,组合注解，自动扫描注解类所在同级包及以下包的bean
public class SpringBootLearningApplication {
     @Value("${book.author}")
     private String bookAuthor;
     @Value("${book.name}")
     private String bookName;

    @RequestMapping("/")
    String index(){
//        return "Hello Spring Boot";
        return "book name is :"+bookName+" and book author is :"+bookAuthor;
    }

    @Autowired
    private AuthorSettings authorSettings;

    @RequestMapping("/author")
    public String index2(){
        return "author name is : "+authorSettings.getName()+" and author age is : "+authorSettings.getAge();
    }



    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringBootLearningApplication.class);
        //关闭banner图
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}
