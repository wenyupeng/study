package com.wen.web;

import com.wen.domain.Person;
import com.wen.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wen
 * @Date: 2019/6/15 21:01
 */
@RestController
public class CacheController {
    @Autowired
    DemoService demoService;
    //http://localhost:8080/put?name=%E6%96%87%E5%AD%97&age=22&address=%E9%BE%99%E6%BA%AA
    @RequestMapping("/put")
    public Person put(Person person) {
        return demoService.save(person);
    }
    //http://localhost:8080/able?id=1
    @RequestMapping("/able")
    public Person cacheable(Person person){
        return demoService.findOne(person);
    }
    //http://localhost:8080/evit?id=26
    @RequestMapping("/evit")
    public String evit(Long id){
        demoService.remove(id);
        return "ok";
    }
}
