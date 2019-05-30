package com.wen._09test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: wen
 * @Date: 2019/5/29 23:38
 */
@Controller
public class NormalController {
    @Autowired
    DemoService demoService;
    @RequestMapping("/normal")
    public String testPage(Model model){
        model.addAttribute("msg",demoService.saySomething());
        return "page";
    }
}
