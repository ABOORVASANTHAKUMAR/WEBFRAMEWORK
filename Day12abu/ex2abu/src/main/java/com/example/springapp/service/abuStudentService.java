package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.abuStudent;
import com.example.springapp.repository.abuStudentRepository;

@Service
public class abuStudentService {
    @Autowired
    abuStudentRepository studentRepository;
    public abuStudent addStudents(abuStudent student)
    {
        return studentRepository.save(student);
    }
    public List<abuStudent>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<abuStudent>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<abuStudent>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}
