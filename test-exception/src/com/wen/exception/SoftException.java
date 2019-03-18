package com.wen.exception;

/**
 *
 * @author wen
 * @date 2018/12/19
 */
public class SoftException extends RuntimeException{
    private static final long serialVersionUID = -7859407207435248984L;
    private final String errorCode;

    public SoftException() {
        super();
        this.errorCode="";
    }

    public SoftException(String errorCode,String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public SoftException(String message, Throwable cause, String errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
