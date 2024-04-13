package com.example.q5.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.q5.model.Student;

@RestController
public class StudentController {
    @GetMapping("/student")
         public List<Student> object()
         {
            List<Student> li=new ArrayList<Student>();
            Student o=new Student();
            o.setStudentName("john");
            o.setMessage("Welcome, john");
            li.add(o);
            return li;
         }
}
