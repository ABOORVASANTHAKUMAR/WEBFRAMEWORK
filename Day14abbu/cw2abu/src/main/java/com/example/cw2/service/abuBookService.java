package com.example.cw2.service;

import com.example.cw2.model.abuBook;
import com.example.cw2.repository.abuBookRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class abuBookService {
    private final abuBookRepo bookRepo;

    public abuBookService(abuBookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public abuBook createBook(abuBook Book) {
        return bookRepo.save(Book);
    }
    public List<abuBook> getAllBooks() {
        return bookRepo.findAll();
    }
    public abuBook getBookById(Long id) {
        return bookRepo.findById(id).orElse(null);
    }
    public abuBook updateBookById(Long id,abuBook book){
        abuBook b = bookRepo.findById(id).orElse(null);
        if(b!=null){
            b.setAuthor(book.getAuthor());
            b.setAvailableCopies(book.getAvailableCopies());
            b.setTitle(book.getTitle());
            b.setTotalCopies(book.getTotalCopies());
            bookRepo.save(b);
        }
        return b;
    }
}
