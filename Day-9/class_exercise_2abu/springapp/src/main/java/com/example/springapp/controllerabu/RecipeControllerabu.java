package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.springapp.model.Recipeabu;
import com.example.springapp.service.RecipeServiceabu;

@RestController
public class RecipeControllerabu {
    @Autowired
    private RecipeServiceabu ser;

    @PostMapping("/api/recipe")
    public ResponseEntity<Recipeabu> post(@RequestBody Recipeabu person) {
        if (ser.post(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/recipe/byname")
    public ResponseEntity<List<Recipeabu>> getAllbyFiltering(@RequestParam("recipeName") String recipeName) {
        List<Recipeabu> li = ser.filter(recipeName);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/recipe/{recipeId}")
    public ResponseEntity<Recipeabu> getbyrecipeId(@PathVariable("recipeId") int recipeId) {
        Recipeabu li = ser.getByid(recipeId);
        if (li!=null) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
