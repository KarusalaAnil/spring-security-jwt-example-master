package com.javatechie.jwt.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/api")
public class UserController {

    @GetMapping("test")
    public String getName() {
        return "This is Anil";
    }
}
