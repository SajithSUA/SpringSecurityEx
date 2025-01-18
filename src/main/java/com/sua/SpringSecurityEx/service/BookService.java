package com.sua.SpringSecurityEx.service;

import com.sua.SpringSecurityEx.model.Book;
import com.sua.SpringSecurityEx.model.BookRestModel;
import com.sua.SpringSecurityEx.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;
    @Autowired
    private PersonService personService;

    public Book create(BookRestModel bookRest)
    {
        Book book = new Book();
        book.setId(bookRest.getId());
        book.setName(bookRest.getName());
        book.setAuthor(personService.findById(bookRest.getAuthorId()));
        return bookRepo.save(book);
    }
}
