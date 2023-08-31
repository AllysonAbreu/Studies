package com.example.auth.repositories;

import com.example.auth.domain.books.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
