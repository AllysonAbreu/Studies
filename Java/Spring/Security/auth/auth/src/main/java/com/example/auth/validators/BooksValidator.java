package com.example.auth.validators;

import com.example.auth.domain.books.Book;

public class BooksValidator {

    public static void isNull(Book existingBook) {
        if (existingBook == null) {
            throw new RuntimeException("Book not found");
        }
    }
}
