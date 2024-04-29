package com.example.cw2.controller;

import com.example.cw2.model.abuBook;
import com.example.cw2.service.abuBookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class abuBookController {
    private final abuBookService bookService;

    public abuBookController(abuBookService BookService) {
        this.bookService = BookService;
    }

    @PostMapping
    public ResponseEntity<abuBook> createBook(@RequestBody abuBook Book) {
        abuBook createdBook = bookService.createBook(Book);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBook);
    }

    @GetMapping
    public ResponseEntity<List<abuBook>> getAllBooks() {
        List<abuBook> Books = bookService.getAllBooks();
        return ResponseEntity.ok(Books);
    }
    @PutMapping("/{bookId}")
    public abuBook updateBookById(@PathVariable Long bookId,@RequestBody abuBook book){
        abuBook b = bookService.updateBookById(bookId, book);
        return b;
    }
    @GetMapping("/{bookId}")
    public abuBook getBookById(@PathVariable Long bookId) {
        abuBook book = bookService.getBookById(bookId);
        return book;
    }
}
