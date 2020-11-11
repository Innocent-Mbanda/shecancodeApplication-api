package com.shecancodeapp.com.service;

import com.shecancodeapp.com.students.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    private List<Student>students = Arrays.asList(
          new Student(1, "John Doe", "johndoe@gmail.com","Male",
                  "Gasabo",123443,
                  "Kimironko","Facebook",
                  "In-Person","Yes","Yes",
                  "Yes","yes","Add paragraph here","Add paragraph here")


//
    );

    public List<Student> getAllStudent(){
         return students;
    }
}
