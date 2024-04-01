package com.example.springExample.repository;

import com.example.springExample.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Person, Integer> {

}
