package com.example.bidirection.serviceabu;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.modelabu.Studenabut;
import com.example.bidirection.modelabu.StudentInfoabu;
import com.example.bidirection.repositoryabu.StudentInfoRepository;
import com.example.bidirection.repositoryabu.StudentRepository;

@Service
public class StudentService {
    public StudentRepository studentRepository;
    public StudentInfoRepository studentInfoRepository;
    public StudentService(StudentRepository studentRepository,StudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public Studenabut saveStudent(Studenabut student)
    {
        return studentRepository.save(student);
    }
    public StudentInfoabu saveStudentInfo(StudentInfoabu studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<Studenabut> getStudents()
    {
        return studentRepository.findAll();
    }
}
