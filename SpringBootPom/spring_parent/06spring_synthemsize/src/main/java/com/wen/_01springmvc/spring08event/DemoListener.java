package com.wen._01springmvc.spring08event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author: wen
 * @Date: 2019/5/19 11:17
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {//实现接口指定监听事件
    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg=event.getMsg();
        System.out.println("demo-listener have accept the message from demo-event "+ msg);
    }
}
