package com.example.auth.services;

import com.example.auth.domain.books.Books;
import com.example.auth.domain.books.request.BookPostRequest;
import com.example.auth.domain.books.request.BookPutRequest;
import com.example.auth.domain.books.response.BookResponse;
import com.example.auth.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.auth.mappers.BookMapper.*;
import static com.example.auth.validators.BooksValidator.isNull;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public List<BookResponse> getAllBooks() {
        try {
            List<Books> all = repository.findAll();
            return toListResponse(all);
        } catch (Exception e) {
            throw new RuntimeException("Books not found");
        }
    }

    public BookResponse getBookById(int id) {
        try {
            Books existingBook = repository.findById(id).orElse(null);
            isNull(existingBook);
            return toResponse(existingBook);
        } catch (Exception e) {
            throw new RuntimeException("Book not found");
        }
    }

    public void addBook(BookPostRequest book) {
        try {
            repository.save(requestPostToDomain(book));
        } catch (Exception e) {
            throw new RuntimeException("Book not created");
        }
    }

    public void updateBook(BookPutRequest book) {
        try {
            isNull(repository.findById(book.getId()).orElse(null));
            repository.save(requestPutToDomain(book));
        } catch (Exception e) {
            throw new RuntimeException("Book not found");
        }
    }

    public void deleteBook(int id) {
        try {
            repository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("Book not found");
        }
    }
}
