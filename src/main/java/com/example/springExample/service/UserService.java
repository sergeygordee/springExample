package com.example.springExample.service;

import com.example.springExample.model.Person;
import com.example.springExample.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public Person findById(int id){
        return userRepository.getOne(id);
    }
    public Person savePerson(Person person){
        return userRepository.save(person);
    }
    public void deletePerson(int id){
        userRepository.deleteById(id);
    }
    public List<Person> findAll(){
        return userRepository.findAll();
    }
}
