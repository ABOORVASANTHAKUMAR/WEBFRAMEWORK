package com.example.relation.serviceabu;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relation.modelabu.Studentabu;
import com.example.relation.repositoryabu.StudentRepositoryabu;

@Service
public class StudentService {
    public StudentRepositoryabu studentRepository;
    public StudentService(StudentRepositoryabu studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public Studentabu saveStudent(Studentabu student)
    {
        return studentRepository.save(student);
    }
    public List<Studentabu> getStudents()
    {
        return studentRepository.findAll();
    }
}
