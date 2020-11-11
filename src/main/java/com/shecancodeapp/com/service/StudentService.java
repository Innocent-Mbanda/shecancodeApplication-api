package com.shecancodeapp.com.service;

import com.shecancodeapp.com.students.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    private List<Student>students = new ArrayList<>( Arrays.asList(
          new Student(1, "John Doe", "johndoe@gmail.com","Male",
                  "Gasabo",123443,
                  "Kimironko","Facebook",
                  "In-Person","Yes","Yes",
                  "Yes","yes","Add paragraph here","Add paragraph here")


//
    ));

    public Student getStudent(String email) {
        return students.stream().filter(student ->
                student.getEmail().equals(email)).findFirst().get();
    }

    public List<Student> getAllStudent(){
         return students;
    }

    public String addStudent(Student student) {
      students.add(student);
      return "Student has been added successfully";


    }

}
