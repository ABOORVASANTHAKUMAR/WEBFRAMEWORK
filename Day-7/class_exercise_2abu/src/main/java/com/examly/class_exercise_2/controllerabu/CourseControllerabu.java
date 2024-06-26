package com.examly.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_2.modelabu.Courseabu;
import com.examly.class_exercise_2.serviceabu.CourseService;

@RestController
public class CourseControllerabu {

     @Autowired
     public CourseService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<Courseabu> postMethodName(@RequestBody Courseabu entity) {

          Courseabu inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<Courseabu>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<Courseabu>> getMethodName() {

          List<Courseabu> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<Courseabu>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<Courseabu>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<Courseabu> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}