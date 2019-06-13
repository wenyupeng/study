package com.wen._02autoconfigbean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: wen
 * @Date: 2019/6/2 23:06
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {
    private static final String MSG="world";
    private String msg=MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
