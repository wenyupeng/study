package com.wen._02autoconfigbean;

/**
 * @Author: wen
 * @Date: 2019/6/2 23:09
 */
public class HelloService {
    private String msg;

    public String sayHello(){
        return "hello"+msg;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
