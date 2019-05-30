package com.wen._07sse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * @Author: wen
 * @Date: 2019/5/29 20:47
 */
@Controller
public class SseController {
    @RequestMapping(value = "/push", produces = "text/event-stream")//event-stream 服务端发送事件的支持 Sever Send Event
    public @ResponseBody String push() {
        Random r = new Random();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "data:Test 1,2,3" + r.nextInt() + "\n\n";
    }
}
