package com.examly.class_exercise_2.repositoryabu;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.class_exercise_2.modelabu.Courseabu;

@Repository
public interface CourseRepo extends JpaRepository<Courseabu, Integer> {

     List<Courseabu> findByCourseName(String courseName);

}