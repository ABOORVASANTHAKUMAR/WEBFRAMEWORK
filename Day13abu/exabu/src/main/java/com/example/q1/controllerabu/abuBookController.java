package com.example.q1.controllerabu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.q1.model.abuBook;
import com.example.q1.service.abuBookService;

@RestController
public class abuBookController {
    @Autowired
    private abuBookService abubookService;

    @GetMapping("/book/{bookId}")
    public ResponseEntity<abuBook> getBookById(@PathVariable Long bookId) {
        abuBook book = abubookService.getBookById(bookId);
        if (book != null) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
