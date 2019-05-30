package com.wen.spring08event;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: wen
 * @Date: 2019/5/19 11:12
 */
public class DemoEvent extends ApplicationEvent {
    private static final long serialVersionUID=1L;
    private String msg;
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the spring08event initially occurred (never {@code null})
     */
    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg=msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
