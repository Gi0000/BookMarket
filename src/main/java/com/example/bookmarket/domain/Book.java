package com.example.bookmarket.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Book {
    private String bookId;
    private String name;
    private BigDecimal unitPrice;
    private String author;
    private String description;
    private String publisher;
    private String category;
    private long unitsInStock;
    private String releaseDate;
    private String condition;


}
