package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/base")
public class UserRestController {

    @GetMapping(value = "/1-param")
    public String personJson(@RequestParam String param){
        return param;
    }

    @GetMapping("/params")
    public List<String> listPersonJson(@RequestParam String[] param){
        return List.of(param);
    }
}
