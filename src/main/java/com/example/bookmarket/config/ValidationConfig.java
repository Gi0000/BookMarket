package com.example.bookmarket.config;

import com.example.bookmarket.validator.BookValidator;
import com.example.bookmarket.validator.UnitsInStockValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;

@Configuration
public class ValidationConfig {

    @Autowired
    UnitsInStockValidator unitsInStockValidator;

    @Bean
    public BookValidator bookValidator() {
        BookValidator bookValidator = new BookValidator();

        bookValidator.springValidators.add((Validator) unitsInStockValidator);


        return bookValidator;
    }

}