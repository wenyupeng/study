package com.wen.springbootcors.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wen on 2018/12/20.
 */
//@RestController
/**
 * 控制器级别的跨域注解
 */
//@CrossOrigin(origins = {"http://localhost:8080/"},maxAge = 3600)
public class TestCorsController {

    @RequestMapping(value = {"/"},method = {RequestMethod.GET,RequestMethod.POST})
    /**
     * 开启跨域资源共享:默认情况下@CrossOrigin允许@RequestMapping注释中指定的所有起始和HTTP方法
     */
//    @CrossOrigin
    public void testCors(){

    }
}
