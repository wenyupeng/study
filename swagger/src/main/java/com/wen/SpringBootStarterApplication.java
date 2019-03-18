package com.wen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class SpringBootStarterApplication
{
    private static Logger log= LoggerFactory.getLogger(SpringBootStarterApplication.class);
    public static void main( String[] args )
    {
        log.info("spring boot start up");
        SpringApplication.run(SpringBootStarterApplication.class,args);
        log.info("spring boot start up");
    }
}
