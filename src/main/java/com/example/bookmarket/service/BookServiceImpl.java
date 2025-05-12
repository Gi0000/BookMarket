package com.example.bookmarket.service;

import com.example.bookmarket.domain.Book;
import com.example.bookmarket.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBookList() {
        return bookRepository.getAllBookList();
    }
}
