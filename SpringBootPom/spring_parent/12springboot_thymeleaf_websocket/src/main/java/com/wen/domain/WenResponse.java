package com.wen.domain;

/**
 * @Author: wen
 * @Date: 2019/6/7 22:45
 */
public class WenResponse {
    private String responseMessage;

    public WenResponse(String message) {
        super();
        this.responseMessage=message;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
