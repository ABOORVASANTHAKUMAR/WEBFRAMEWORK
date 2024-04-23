package com.example.bidirection.controllerabu;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.modelabu.Studenabut;
import com.example.bidirection.modelabu.StudentInfoabu;
import com.example.bidirection.serviceabu.StudentService;

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
    @PostMapping("/api/poststudent")
    public Studenabut postMethodName(@RequestBody Studenabut student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public StudentInfoabu postMethodName(@RequestBody StudentInfoabu studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<Studenabut> getMethodName() {
        return studentService.getStudents();
    }
    
}