package com.shecancodeapp.com.controller;

import com.shecancodeapp.com.service.StudentService;
import com.shecancodeapp.com.students.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private StudentService studentService;
    //access, function-return-type and functionName)//
   @RequestMapping("/api")
    public String welcome(){
        return "Shecancode API";

    }

    @RequestMapping("/students")
    public List<Student> getAllStudents(){
       return studentService.getAllStudent();
    }

}
