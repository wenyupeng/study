package com.wen.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @Author: wen
 * @Date: 2019/6/22 0:22
 */
@Component
public class Receiver {

    @JmsListener(destination = "my-destination")//监听目的地发送的消息
    public void receiveMessage(String message) {
        System.out.println("接受到 ： 《" + message + "》");
    }
}
