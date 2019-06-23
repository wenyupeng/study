package com.wen.dao;

import com.wen.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @Author: wen
 * @Date: 2019/6/16 23:42
 */
@Repository
public class PersonDao {
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    //@Resource注入基于字符串的简单属性操作方法
    @Resource(name = "stringRedisTemplate")
    ValueOperations<String,String> valOpsStr;

    @Autowired
    RedisTemplate<Object,Object> redisTemplate;
    //@Resource注入基于对象的简单属性操作方法
    @Resource(name = "redisTemplate")
    ValueOperations<Object,Object> valOps;

    public void stringRedisTemplateDemo(){
        valOpsStr.set("xx","yy");
    }

    public void save(Person person){
        valOps.set(person.getId(),person);
    }

    public String getString(){
        return valOpsStr.get("xx");
    }

    public Person getPerson(){
        return (Person) valOps.get("1");
    }
}
