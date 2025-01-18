package com.sua.SpringSecurityEx.controller;

import com.sua.SpringSecurityEx.model.Book;
import com.sua.SpringSecurityEx.model.BookRestModel;
import com.sua.SpringSecurityEx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/book")
    public Book create(@RequestBody BookRestModel book) {

        return bookService.create(book);
    }
}
