package com.example.demo.controller;

import com.example.demo.document.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/auth/signUp")
    public String CreateUser(@RequestBody User user){
      return  userService.createAccount(user);

    }
    @PostMapping ("/sigIn")
    public String Signing(@RequestBody User user){
        return userService.login();
    }

    @GetMapping("/users")
    public List<User>getUsers(){
        return userService.getUsers();
    }

    @PostMapping("/users/{id}")
    public Query getUser(@RequestBody String id){
        return userService.getUser(id);
    }






}
