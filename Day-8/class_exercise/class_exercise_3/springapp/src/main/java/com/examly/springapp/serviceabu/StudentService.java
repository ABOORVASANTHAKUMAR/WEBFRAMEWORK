package com.examly.springapp.serviceabu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.modelabu.Student;
import com.examly.springapp.repositoryabu.StudentRepoabu;

@Service
public class StudentService {
    @Autowired
    private StudentRepoabu studentRepo;

    public boolean post(Student student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Student> start(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public List<Student> end(int mark) {
        return studentRepo.findByMarksLessThan(mark);
    }

}
