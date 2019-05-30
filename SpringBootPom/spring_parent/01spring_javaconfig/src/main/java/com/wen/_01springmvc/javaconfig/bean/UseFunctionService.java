package com.wen._01springmvc.javaconfig.bean;

/**
 * create a class to invoke the functionService
 * Created by wen on 2019/4/28.
 */
public class UseFunctionService {
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService=functionService;
    }
    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
