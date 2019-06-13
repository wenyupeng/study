package com.wen.web;

import com.wen.dao.PersonRepository;
import com.wen.domain.Person;
import com.wen.support.PersonRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: wen
 * @Date: 2019/6/11 23:27
 */
@RestController
public class DataController {
    @Autowired
    PersonRepository personRepository;
    @Autowired
    PersonRepository2 personRepository2;

    //    http://localhost:8080/save?name=dd&address=%E5%B9%BF%E5%B7%9E&age=18
    @RequestMapping("/save")
    public Person save(String name, String address, Integer age) {
        Person p = personRepository.save(new Person(null, name, age, address));
        return p;
    }

    //    http://localhost:8080/q1?address=%E5%B9%BF%E5%B7%9E
    @RequestMapping("/q1")
    public List<Person> q1(String address) {
        List<Person> people = personRepository.findByAddress(address);
        return people;
    }

    //    http://localhost:8080/q2?address=%E5%B9%BF%E5%B7%9E&name=dd
    @RequestMapping(value = "/q2")
    public Person q2(String name, String address) {
        Person person = personRepository.findByNameAndAddress(name, address);
        return person;
    }

    //    http://localhost:8080/q3?address=%E5%B9%BF%E5%B7%9E&name=dd
    @RequestMapping("/q3")
    public Person q3(String name, String address) {
        Person p = personRepository.withNameAndAddressQuery(name, address);
        return p;
    }

    //    http://localhost:8080/q4?address=%E5%B9%BF%E5%B7%9E&name=dd
    @RequestMapping("/q4")
    public Person q4(String name, String address) {
        Person p = personRepository.withNameAndAddressNamedQuery(name, address);
        return p;
    }

    //    http://localhost:8080/sort
    @RequestMapping("/sort")
    public List<Person> sort() {
        List<Person> people = personRepository.findAll(new Sort(Sort.Direction.ASC, "age"));
        return people;
    }

    //    http://localhost:8080/page
    @RequestMapping("/page")
    public Page<Person> page() {
        Page<Person> pagePeople = personRepository.findAll(new PageRequest(1, 2));
        return pagePeople;
    }

    @RequestMapping("/auto")
    public Page<Person> auto(Person person) {
        Page<Person> pagePeople = personRepository2.findByAuto(person, new PageRequest(0, 10));
        return pagePeople;
    }
}
