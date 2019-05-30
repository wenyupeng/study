package com.wen._01springmvc.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by wen on 2019/5/4.
 */
@Service
@Scope(value = "prototype")
public class DemoPrototypeService {
}
