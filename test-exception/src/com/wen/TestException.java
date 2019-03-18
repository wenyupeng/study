package com.wen;

import com.wen.exception.FeatureExceptionCode;
import com.wen.exception.FeatureSoftException;

/**
 * Created by wen on 2018/12/19.
 */
public class TestException {
    public static void main(String[] args) {
        System.out.println("definition exception");
        throw new FeatureSoftException(FeatureExceptionCode.TEST_EXCEPTION_ERROR);
    }
}
