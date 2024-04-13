package com.example.q2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/welcome")
    public String welcome(@RequestParam String name)
    {
        return "Welcome "+name+"!";            
    }
}
