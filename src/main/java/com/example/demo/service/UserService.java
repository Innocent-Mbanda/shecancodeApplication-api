package com.example.demo.service;

import com.example.demo.document.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserService {
   @Autowired
    private UserRepository userRepository;
   public UserService (UserRepository userRepository){
       this.userRepository =userRepository;
   }
    public String createAccount(User user){
        userRepository.save(user);
        return ("Account created was successful") ;
    }

    public String login(){
        userRepository.findAll();
        userRepository.findAll();
        return("Signed-In");
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public Query getUser(String id) {
//        return userRepository.findById(id);
        return new Query(Criteria.where("id").is(id));
    }
}
