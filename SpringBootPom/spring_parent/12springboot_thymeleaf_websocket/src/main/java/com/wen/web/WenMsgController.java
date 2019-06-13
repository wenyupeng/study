package com.wen.web;

import com.wen.domain.WenMessage;
import com.wen.domain.WenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

/**
 * @Author: wen
 * @Date: 2019/6/7 22:46
 */
@Controller
public class WenMsgController {
    @Autowired
    private SimpMessagingTemplate messagingTemplate;//向浏览器发消息的途径

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")//将消息发送到订阅了此路径的地方
    public WenResponse say(WenMessage message) throws InterruptedException {
        Thread.sleep(3000);
        return new WenResponse("Welcome, "+message.getName()+"!");
    }

    @MessageMapping("/chat")
    public void handleChat(Principal principal,String msg) {//principal包含当前用户的信息
        if (principal.getName().equals("wyf")){
            //接收消息的用户   浏览器订阅的地址    消息本省
            messagingTemplate.convertAndSendToUser("wisely","queue/notifications",principal.getName()+"-send:"+msg);
        }else {
            messagingTemplate.convertAndSendToUser("wyf","/queue/notifications",principal.getName()+"-send:"+msg);
        }
    }
}
