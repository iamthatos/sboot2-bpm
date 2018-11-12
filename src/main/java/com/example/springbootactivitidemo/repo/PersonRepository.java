package com.example.springbootactivitidemo.repo;

import com.example.springbootactivitidemo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long>{

    Person findByName(String name);
    
}
