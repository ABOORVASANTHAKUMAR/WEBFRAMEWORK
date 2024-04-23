package com.example.relation.controllerabu;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.modelabu.Studentabu;
import com.example.relation.serviceabu.StudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class StudentControllerabu {
    public StudentService studentService;
    public StudentControllerabu(StudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public Studentabu postMethodName(@RequestBody Studentabu student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<Studentabu> getMethodName() {
        return studentService.getStudents();
    }
    
}
