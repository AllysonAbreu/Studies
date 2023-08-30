package com.example.auth.validators;

import com.example.auth.domain.books.Books;

public class BooksValidator {

    public static void isNull(Books existingBook) {
        if (existingBook == null) {
            throw new RuntimeException("Book not found");
        }
    }
}
