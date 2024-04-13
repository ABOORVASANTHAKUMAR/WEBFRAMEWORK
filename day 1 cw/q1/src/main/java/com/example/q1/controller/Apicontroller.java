package com.example.q1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller {
   @GetMapping("/welcome")
   public String welcome()
   {
      return "Welcome Spring Boot!";
   }
}
