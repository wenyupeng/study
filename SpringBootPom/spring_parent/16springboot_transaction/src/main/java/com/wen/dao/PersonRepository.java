package com.wen.dao;

import com.wen.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: wen
 * @Date: 2019/6/15 10:11
 */
public interface PersonRepository extends JpaRepository<Person,Long> {

}
