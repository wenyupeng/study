package com.wen.service.impl;

import com.wen.dao.PersonRepository;
import com.wen.domain.Person;
import com.wen.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: wen
 * @Date: 2019/6/15 10:19
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    PersonRepository personRepository;
    //http://localhost:8080/rollback?name=wen&age=26
    @Override
    @Transactional(rollbackFor = {IllegalArgumentException.class})
    public Person savePersonWithRollBack(Person person) {
        Person p = personRepository.save(person);

        if (person.getName().equals("wen")){
            throw new IllegalArgumentException("wen已存在，数据出错");
        }
        return p;
    }

    @Override
    @Transactional(noRollbackFor = {IllegalArgumentException.class})
    public Person savePersonWithoutRollBack(Person person) {
        Person p = personRepository.save(person);

        if (person.getName().equals("wen")){
            throw new IllegalArgumentException("发生异常数据不回滚");
        }
        return p;}
}
