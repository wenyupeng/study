package com.wen._02domain;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wen
 * @Date: 2019/5/26 23:07
 */
@RestController
@RequestMapping("/rest")
public class DemoRestController {

    @RequestMapping(value = "/getjson", produces = "application/json;charset=UTF-8")
    public DemoObj getjson(DemoObj demoObj) {
        return new DemoObj(demoObj.getId()+1, demoObj.getName()+"yy");
    }

    @RequestMapping(value = "/getxml", produces = "application/xml;charset=UTF-8")
    public DemoObj getxml(DemoObj demoObj) {
        return new DemoObj(demoObj.getId()+1, demoObj.getName()+"yy");
    }
}
