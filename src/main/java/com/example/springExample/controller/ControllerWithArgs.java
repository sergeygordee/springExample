package com.example.springExample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ControllerWithArgs {
    @RequestMapping(value = "/helloPage")
    public String helloWorldController(@RequestParam(name = "name",required = false,  defaultValue = "UserName") String name,
                                       @RequestParam(name = "age",required = false,defaultValue = "18") int age,
                                       Model model){
        model.addAttribute("name", name);
        model.addAttribute("age",age);
        return "helloPage";
    }
}
