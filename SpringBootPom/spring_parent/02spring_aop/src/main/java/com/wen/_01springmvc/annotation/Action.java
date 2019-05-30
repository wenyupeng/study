package com.wen._01springmvc.annotation;

import java.lang.annotation.*;

/**
 * Created by wen on 2019/4/29.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
