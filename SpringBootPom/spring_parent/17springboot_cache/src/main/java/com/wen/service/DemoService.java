package com.wen.service;

import com.wen.domain.Person;

/**
 * @Author: wen
 * @Date: 2019/6/15 20:28
 */
public interface DemoService {
    Person save(Person person);

    void remove(Long id);

    Person findOne(Person person);

}
