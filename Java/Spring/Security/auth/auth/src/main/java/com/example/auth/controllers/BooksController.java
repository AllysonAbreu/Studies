package com.example.auth.controllers;


import com.example.auth.domain.books.Book;
import com.example.auth.domain.books.request.BookPostRequest;
import com.example.auth.domain.books.request.BookPutRequest;
import com.example.auth.domain.books.response.BookResponse;
import com.example.auth.services.books.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    @Autowired
    private BookService service;

    @GetMapping("/lista")
    public ResponseEntity<List<BookResponse>> getAllBooks() {
        return ResponseEntity.ok(service.getAllBooks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookResponse> getBookById(@PathVariable("id") int id) {
        return ResponseEntity.ok().body(service.getBookById(id));
    }

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody @Valid BookPostRequest book) {
        service.addBook(book);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Book> updateBook(@RequestBody @Valid BookPutRequest book) {
        service.updateBook(book);
        return ResponseEntity.accepted().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable("id") int id) {
        service.deleteBook(id);
        return ResponseEntity.ok().build();
    }
}
