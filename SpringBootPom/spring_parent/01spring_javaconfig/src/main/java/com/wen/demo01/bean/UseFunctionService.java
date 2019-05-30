package com.wen.demo01.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * create a class to invoke the functionService
 * Created by wen on 2019/4/28.
 */
@Service
public class UseFunctionService {
    @Autowired
    FunctionService functionService;

    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
