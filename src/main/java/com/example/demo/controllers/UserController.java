package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value= "/api/v1")
public class UserController {

    @RequestMapping(value = "/1-param")
    public String personNameWithParam(Model model, @RequestParam String name){
        model.addAttribute("name", name);
        return "1-param/hello";
    }

    @RequestMapping(value = "/2-param")
    public String personNameWithParam2(Model model, @RequestParam String name, @RequestParam String firstname){
        model.addAttribute("name", name);
        model.addAttribute("firstname", firstname);
        return "2-param/hello";
    }

    @RequestMapping(value = "/params")
    public String listPerson(Model model, @RequestParam List<String> users ){
        model.addAttribute("user", users);
        return "Params/hello";
    }
}
