package com.wen.dao;

import com.wen.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Author: wen
 * @Date: 2019/6/11 22:34
 */
public interface PersonRepository extends JpaRepository<Person,Long> {

    List<Person> findByAddress(String name);

    Person findByNameAndAddress(String name,String address);

    @Query("select p from Person p where p.name=:name and p.address=:address")
    Person withNameAndAddressQuery(@Param("name") String name,@Param("address")String address);

    Person withNameAndAddressNamedQuery(String name,String address);

}
