package com.rafaeljovaneli.bookstoremanager.controller;

import com.rafaeljovaneli.bookstoremanager.dto.MessageResponceDTO;
import com.rafaeljovaneli.bookstoremanager.entity.Book;
import com.rafaeljovaneli.bookstoremanager.repository.BookRepository;
import com.rafaeljovaneli.bookstoremanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @PostMapping
    public MessageResponceDTO create(@RequestBody Book book){
       return bookService.create(book);
    }

}
