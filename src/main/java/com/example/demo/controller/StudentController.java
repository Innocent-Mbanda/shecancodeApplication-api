package com.example.demo.controller;


import com.example.demo.document.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
  @Autowired
  private StudentService  studentService;


    //access, function-return-type and functionName)//
    @RequestMapping("/")
    public String welcome() {
        return "Shecancode API";

    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudent();
    }

    //@RequestMapping(method = RequestMethod.POST,value = "/student/add")
    @PostMapping("/student/add")
    public String  addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);

    }

    @GetMapping("/students/{id}")
    public Optional<Student> findStudent (@PathVariable String id) {
        return studentService.findStudent(id);

    }

    @PutMapping("/student")
    public void changeData(@RequestBody Student student){
         studentService.chageData(student);
    }
}
