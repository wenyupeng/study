package com.wen.exception;

/**
 * Created by wen on 2018/12/19.
 */

public class FeatureExceptionMsg {
    /**
     * 异常编码（服务、模块内自行定义的一场编码）
     */
    private String errorCode;
    /**
     * 异常描述信息
     */
    private String message;

    public FeatureExceptionMsg() {
        super();
    }

    public FeatureExceptionMsg(String errorCode, String message) {
        super();
        this.errorCode = errorCode;
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
