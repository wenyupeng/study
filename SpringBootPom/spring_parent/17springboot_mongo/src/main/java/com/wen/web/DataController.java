package com.wen.web;

import com.wen.dao.PersonRepository;
import com.wen.domain.Location;
import com.wen.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @Author: wen
 * @Date: 2019/6/16 20:10
 */
@RestController
public class DataController {
    @Autowired
    PersonRepository personRepository;

    //http://localhost:8080/save
    @RequestMapping("/save")
    public Person save() {
        Person p = new Person("wyf", 32);
        Collection<Location> locations = new LinkedHashSet<>();
        Location loc1 = new Location("上海1", "2009");
        Location loc2 = new Location("上海2", "2009");
        Location loc3 = new Location("上海3", "2009");
        Location loc4 = new Location("上海4", "2009");
        locations.add(loc1);
        locations.add(loc2);
        locations.add(loc3);
        locations.add(loc4);
        p.setLocations(locations);
        return personRepository.save(p);
    }

    //http://localhost:8080/q1?name=wyf
    @RequestMapping("/q1")
    public Person q1(String name) {
        return personRepository.findByName(name);
    }

    //http://localhost:8080/q2?age=32
    @RequestMapping("/q2")
    public List<Person> q2(Integer age) {
        return personRepository.withQueryFindByAge(age);
    }


}
