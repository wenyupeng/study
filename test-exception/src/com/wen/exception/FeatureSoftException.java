package com.wen.exception;

import java.text.MessageFormat;

/**
 *
 * @author wen
 * @date 2018/12/19
 */
public class FeatureSoftException extends SoftException {

    private static final long serialVersionUID = 2252402253889585412L;

    public FeatureSoftException(FeatureExceptionCode code) {
        super(code.getExceptionMsg().getErrorCode(),code.getExceptionMsg().getMessage());
    }
    public FeatureSoftException(FeatureExceptionCode code,Object... format) {
        super(code.getExceptionMsg().getErrorCode(), MessageFormat.format(code.getExceptionMsg().getMessage(), format));
    }

}
