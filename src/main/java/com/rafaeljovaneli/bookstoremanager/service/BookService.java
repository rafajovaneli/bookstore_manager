package com.rafaeljovaneli.bookstoremanager.service;

import com.rafaeljovaneli.bookstoremanager.dto.MessageResponceDTO;
import com.rafaeljovaneli.bookstoremanager.entity.Book;
import com.rafaeljovaneli.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponceDTO create(Book book){
        Book savedBook = bookRepository.save(book);
        return MessageResponceDTO.builder()
                .message("Book created with ID " + savedBook.getId())
                .build();
    }

}
