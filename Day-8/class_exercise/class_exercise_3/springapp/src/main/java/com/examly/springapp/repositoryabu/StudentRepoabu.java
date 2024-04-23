package com.examly.springapp.repositoryabu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.modelabu.Student;

import java.util.List;

@Repository
public interface StudentRepoabu extends JpaRepository<Student, Long> {

    List<Student> findByMarksGreaterThan(int mark);

    List<Student> findByMarksLessThan(int mark);

}
