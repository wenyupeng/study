package com.example.testwebexception.controller;

import com.example.testwebexception.exception.FeatureExceptionCode;
import com.example.testwebexception.exception.FeatureSoftException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wen on 2018/12/19.
 */
@RestController
public class TestController {

    private static Logger log= LoggerFactory.getLogger(TestController.class);

    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "/")
    public void test(){
        log.info("request apply the api");
        for (int i = 0; i < 5; i++) {
            System.out.println("element : "+i);
        }
        throw new FeatureSoftException(FeatureExceptionCode.TEST_EXCEPTION_ERROR);
    }
}
