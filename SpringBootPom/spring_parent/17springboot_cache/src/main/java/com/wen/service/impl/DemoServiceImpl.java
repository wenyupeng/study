package com.wen.service.impl;

import com.wen.dao.PersonRepository;
import com.wen.domain.Person;
import com.wen.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @Author: wen
 * @Date: 2019/6/15 20:30
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    PersonRepository personRepository;

    @Override
    //将更新的或新增的数据放到缓存中
    @CachePut(value = "people", key = "#person.id")//方法返回值必定放入缓存
    public Person save(Person person) {
        Person p = personRepository.save(person);
        System.out.println("id 为 key :" + person.getId() + "数据缓存");
        return p;
    }

    @Override
    //从缓存people中删除key为id的值
    @CacheEvict(value = "people")//从缓存中删除数据
    public void remove(Long id) {
        System.out.println("缓存中删除 id/ke y为: " + id + "数据");
        personRepository.deleteById(id);

    }

    @Override
    @Cacheable(value = "people",key = "#person.id")//方法执行前，先检查缓存中是否有数据，有则直接返回缓存的数据，没有则将方法返回的数据缓存
    public Person findOne(Person person) {
        Person p= personRepository.getOne(person.getId());
        System.out.println(" id 为："+person.getId()+"数据做缓存");
        return p;
    }
}
