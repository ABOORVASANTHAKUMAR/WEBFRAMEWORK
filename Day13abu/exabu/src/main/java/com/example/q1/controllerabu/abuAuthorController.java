package com.example.q1.controllerabu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.q1.model.abuAuthor;
import com.example.q1.model.abuBook;
import com.example.q1.service.abuAuthorService;
import com.example.q1.service.abuBookService;

@RestController
public class abuAuthorController {
    @Autowired
    private abuAuthorService authorService;
@Autowired
private BookService bookService;
    @PostMapping("/author")
    public ResponseEntity<abuAuthor> createAuthor(@RequestBody abuAuthor author) {
        abuAuthor savedAuthor = authorService.saveAuthor(author);
        return new ResponseEntity<>(savedAuthor, HttpStatus.CREATED);
    }

    @PostMapping("/book/author/{authorId}")
    public ResponseEntity<abuBook> createBookForAuthor(@PathVariable Long authorId, @RequestBody abuBook book) {
        abuBook savedBook = bookService.saveBook(authorId, book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping("/author/{authorId}")
    public ResponseEntity<abuAuthor> getAuthorById(@PathVariable Long authorId) {
        abuAuthor author = authorService.getAuthorById(authorId);
        if (author != null) {
            return new ResponseEntity<>(author, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/author")
    public ResponseEntity<List<abuAuthor>> getAllAuthors() {
        List<abuAuthor> authors = authorService.getAllAuthors();
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }

    @PutMapping("/author/{authorId}")
    public ResponseEntity<abuAuthor> updateAuthor(@PathVariable Long authorId, @RequestBody abuAuthor author) {
        abuAuthor updatedAuthor = authorService.updateAuthor(authorId, author);
        if (updatedAuthor != null) {
            return new ResponseEntity<>(updatedAuthor, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable Long bookId) {
        bookService.deleteBook(bookId);
        return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
    }
}
