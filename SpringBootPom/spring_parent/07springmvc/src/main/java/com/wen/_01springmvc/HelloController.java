package com.wen._01springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: wen
 * @Date: 2019/5/26 16:23
 */
@Controller
public class HelloController {
    @RequestMapping("index")
    public String hello(){
        System.out.println("hello spring mvc");
        return "index";
    }
}
