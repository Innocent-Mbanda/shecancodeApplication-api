package com.shecancodeapp.com.controller;

import com.shecancodeapp.com.service.StudentService;
import com.shecancodeapp.com.students.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private StudentService studentService;
    //access, function-return-type and functionName)//
   @RequestMapping("/")
    public String welcome(){
        return "Shecancode API";

    }

    @RequestMapping("/students")
    public List<Student> getAllStudents(){
       return studentService.getAllStudent();
    }



//@RequestMapping(method = RequestMethod.POST,value = "/student/add")
    @PostMapping("/student/add")
public String addStudent ( @RequestBody Student student){
   return studentService.addStudent(student);

}

@GetMapping("/student/{id}")
    public Student getstudent(@PathVariable String email){
       return studentService.getStudent(email);
}

}
