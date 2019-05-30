package com.wen._04controlleradvice;

import com.wen._02domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: wen
 * @Date: 2019/5/27 22:28
 */
@Controller
public class AdviceController {
    @RequestMapping("/advice")
    public String getSomething(@ModelAttribute("msg") String msg, DemoObj demoObj){
        throw new IllegalArgumentException("非常抱歉，参数有误/ "+"来自 @ModelAttribute :" +msg);
    }
}
