package com.example.springExample.controller;

import com.example.springExample.model.Person;
import com.example.springExample.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PersonController {
    private final UserService userService;

    public PersonController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/personCreate")
    public String createPersonForm(Person person){
        return "personCreate";
    }
    @PostMapping("/personCreate")
    public String createPerson(Person person){
        userService.savePerson(person);
        return "redirect:/persons";
    }
    @GetMapping("/personDelete/{id}")
    public String deletePerson(@PathVariable("id") int id){
        userService.deletePerson(id);
        return "redirect:/persons";
    }
    @GetMapping("/persons")
    public String findAll(Model model){
        List<Person> persons = userService.findAll();
        model.addAttribute("persons", persons);
        return "personList";
    }
}
