package com.shecancodeapp.com.service;

import com.shecancodeapp.com.students.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    private List<Student>students = new ArrayList<>( Arrays.asList(
          new Student("1", "John Doe", "johndoe@gmail.com","Male",
                  "Gasabo","123443",
                  "Kimironko","Facebook",
                  "In-Person","Yes","Yes",
                  "Yes","yes","Add paragraph here","Add paragraph here")


//
    ));

    public List<Student> getAllStudent(){
         return students;
    }

    public String addStudent(Student student) {
      students.add(student);
      return "Student has been added successfully";


    }

    public Student findStudent(String id) {
        return students.stream().filter(student ->
                student.getId().equals(id)).findFirst().get();
    }

    public void chageData(String id,Student student ) {
        for (int i =0; i<students.size();i++){
            Student st =students.get(i);
            if (st.getId().equals(id)){
                students.set(i,student);
            }
        }
    }

}
