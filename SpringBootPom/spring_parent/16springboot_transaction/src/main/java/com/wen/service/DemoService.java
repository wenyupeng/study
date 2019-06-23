package com.wen.service;

import com.wen.domain.Person;

/**
 * @Author: wen
 * @Date: 2019/6/15 10:15
 */
public interface DemoService {
    public Person savePersonWithRollBack(Person person);
    public Person savePersonWithoutRollBack(Person person);
}
