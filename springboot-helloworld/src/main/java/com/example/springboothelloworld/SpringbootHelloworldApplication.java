package com.example.springboothelloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootHelloworldApplication {

    private static final Logger log= LoggerFactory.getLogger(SpringbootHelloworldApplication.class);

    public static void main(String[] args) {
        log.info("spring boot start up");
        SpringApplication.run(SpringbootHelloworldApplication.class, args);
        log.info("spring boot start up");
    }

}

