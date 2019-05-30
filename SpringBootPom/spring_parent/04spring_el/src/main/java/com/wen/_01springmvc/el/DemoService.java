package com.wen._01springmvc.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by wen on 2019/5/4.
 */
@Service
public class DemoService {
    @Value("其他类的属性，注入普通字符串")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
