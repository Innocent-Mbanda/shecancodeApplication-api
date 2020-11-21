package com.example.demo.service;

import com.example.demo.document.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService {
   @Autowired
    private UserRepository userRepository;
    public String createAccount(User user){
        userRepository.save(user);
        return ("Account created was successful") ;
    }

    public String login(){
        userRepository.findAll();
        userRepository.toString();
        return("Signed-In");
    }

}
