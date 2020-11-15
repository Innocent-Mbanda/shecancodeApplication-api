package com.example.demo.service;



import com.example.demo.document.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository){
        this.studentRepository =studentRepository;
    }
    public List<Student> getAllStudent(){
         return studentRepository.findAll();
    }

    public String addStudent(Student student) {
      studentRepository.save(student);
      return "Student has been added successfully";


    }



    public Optional<Student> findStudent(String id) {
        return studentRepository.findById(id);
    }

    public void chageData(Student student ) {
        System.out.println("your data have changed and saved");
       studentRepository.save(student);
    }

}
