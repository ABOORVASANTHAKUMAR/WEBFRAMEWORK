package com.example.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.abuAuthor;
import com.example.q1.model.abuBook;
import com.example.q1.repository.abuAuthorRepository;
import com.example.q1.repository.abuBookRepository;

@Service
public class abuBookService {
    @Autowired
    private abuBookRepository bookRepository;
@Autowired
private abuAuthorRepository authorRepository;
    public abuBook saveBook(Long authorId, abuBook book) {
        abuAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public abuBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

