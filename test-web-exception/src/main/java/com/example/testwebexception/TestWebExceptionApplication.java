package com.example.testwebexception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestWebExceptionApplication {
    private static Logger log= LoggerFactory.getLogger(TestWebExceptionApplication.class);

    public static void main(String[] args) {
        log.info("spring boot start up");
        SpringApplication.run(TestWebExceptionApplication.class, args);
        log.info("arguments : "+args);
    }

}

