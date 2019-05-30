package com.wen.demo01.bean;

import org.springframework.stereotype.Service;

/**
 * Created by wen on 2019/4/28.
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "hello world :"+word+" !";
    }
}
