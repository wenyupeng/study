package com.example.testwebexception.exception;

/**
 * Created by wen on 2018/12/19.
 */
public enum  FeatureExceptionCode {
    /**
     * 定义枚举异常信息：统一抛出异常的信息
     */
    TEST_EXCEPTION_ERROR(new FeatureExceptionMsg("errorCode","error message"));

    private FeatureExceptionMsg exceptionMsg;

    FeatureExceptionCode(FeatureExceptionMsg featureExceptionMsg) {
        this.exceptionMsg=featureExceptionMsg;
    }

    public FeatureExceptionMsg getExceptionMsg() {
        return exceptionMsg;
    }
}
