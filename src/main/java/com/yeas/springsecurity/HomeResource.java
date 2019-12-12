package com.yeas.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeResource{
    
    @GetMapping
    public String home(){
        return "<h1>Home it is</h1>";
    }

    @GetMapping("/user")
    public String user(){
        return "<h1>user and admin location</h1>";
    }

    @GetMapping("/admin")
    public String admin(){
        return "<h1>Admin area</h1>";
    }
}