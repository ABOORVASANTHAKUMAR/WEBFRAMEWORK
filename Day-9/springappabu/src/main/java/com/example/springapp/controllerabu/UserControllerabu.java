package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Userabu;
import com.example.springapp.service.UserServiceabu;

@RestController
@RequestMapping("/api")
public class UserControllerabu {
    
    @Autowired
    private UserServiceabu userService;

    @PostMapping("/user")
    public ResponseEntity<Userabu> post(@RequestBody Userabu user)
    {
        if(userService.postUser(user))
        {
            return new ResponseEntity<Userabu>(user, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<Userabu> getById(@PathVariable int userId)
    {
        Userabu user = userService.getById(userId);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<Userabu>(user, HttpStatus.OK);
        }
    }

    @GetMapping("/user/byName/{userName}")
    public ResponseEntity<Userabu> getByUserName(@PathVariable String userName)
    {
        Userabu user = userService.getByUserName(userName);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<Userabu>(user, HttpStatus.OK);
        }
    }
}
