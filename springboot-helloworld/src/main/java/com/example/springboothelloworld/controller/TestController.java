package com.example.springboothelloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wen on 2018/12/19.
 */
@RestController
public class TestController {

    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},name = "test",value = {"/"},path = {"/"})
    public String index(){
        return "spring boot test";
    }
}
