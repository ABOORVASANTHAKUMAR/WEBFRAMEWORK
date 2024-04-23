package com.examly.class_exercise_2.serviceabu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.class_exercise_2.modelabu.Courseabu;
import com.examly.class_exercise_2.repositoryabu.CourseRepo;

@Service
public class CourseService {

     @Autowired
     public CourseRepo courseRepo;

     public Courseabu SaveEntity(Courseabu entity) {
          return courseRepo.save(entity);

     }

     public List<Courseabu> getDetails() {
          return courseRepo.findAll();

     }

     public List<Courseabu> findByCourseName(String courseName) {
          return courseRepo.findByCourseName(courseName);
     }

}
