package com.example.q3.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller
 {
    @GetMapping("/welcome")
           public String welcome(@RequestParam(name="id") String color)
           {
            return "My favorite color is "+color+"!";
           }         
}
