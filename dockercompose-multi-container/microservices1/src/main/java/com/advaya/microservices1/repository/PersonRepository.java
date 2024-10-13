package com.advaya.microservices1.repository;

import com.advaya.microservices1.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
