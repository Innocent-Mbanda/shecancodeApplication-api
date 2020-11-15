package com.example.demo.repository;


import com.example.demo.document.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface  StudentRepository extends MongoRepository<Student, String> {

}
