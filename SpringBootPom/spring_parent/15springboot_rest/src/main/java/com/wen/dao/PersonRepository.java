package com.wen.dao;

import com.wen.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * @Author: wen
 * @Date: 2019/6/13 22:09
 */
//@RepositoryRestResource(path = "people")
public interface PersonRepository extends JpaRepository<Person,Long> {

    //http://localhost:8080/persons/search/nameStartsWith?name=cd
    @RestResource(path = "nameStartsWith",rel = "nameStartsWith")
    Person findByNameStartsWith(@Param("name") String name);


    //http://localhost:8080/persons/?page=1&size=2
//    Person findByNameStartingWith(String name);
}
