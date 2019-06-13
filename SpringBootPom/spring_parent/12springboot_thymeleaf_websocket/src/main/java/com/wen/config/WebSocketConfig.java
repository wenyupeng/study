package com.wen.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * @Author: wen
 * @Date: 2019/6/7 22:39
 */
@Configuration
@EnableWebSocketMessageBroker//开启使用STOMP协议来传输基于代理（message broker）的消息
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        //注册STOMP的endpoint，使用指定的SockJS协议
        registry.addEndpoint("/endpointWisely").withSockJS();
        registry.addEndpoint("/endpointChat").withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        //广播式配置一个/topic消息代理,点对点的代理
        registry.enableSimpleBroker("queue","/topic");
    }
}
