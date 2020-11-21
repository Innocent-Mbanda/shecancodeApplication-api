package com.example.demo.controller;

import com.example.demo.document.User;
import com.example.demo.service.UserService;
import jdk.jfr.Frequency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/auth/signUp")
    public String CreateUser(@RequestBody User user){
      return  userService.createAccount(user);

    }
    @PostMapping("/sigIn")
    public String Signing(@RequestBody User user){
        return userService.login();
    }




}
