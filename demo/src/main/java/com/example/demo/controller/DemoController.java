package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {


    @GetMapping
    public String index(){
        return "try to give a username in url";
    }

    @GetMapping("/{username}")
    public  String getUser(@PathVariable("username") String username){
        return username;
    }



}
