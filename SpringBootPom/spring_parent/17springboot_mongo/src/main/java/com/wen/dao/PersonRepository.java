package com.wen.dao;

import com.wen.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * @Author: wen
 * @Date: 2019/6/16 20:05
 */
public interface PersonRepository extends MongoRepository<Person, String> {

    Person findByName(String name);//支持方法名查询

    //支持Query查询，查询参数构造JSON字符串
    @Query("{'age':?0}")
    List<Person> withQueryFindByAge(Integer age);
}
