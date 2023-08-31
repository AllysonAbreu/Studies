package com.example.auth.mappers;

import com.example.auth.domain.books.Book;
import com.example.auth.domain.books.request.BookPostRequest;
import com.example.auth.domain.books.request.BookPutRequest;
import com.example.auth.domain.books.response.BookResponse;

import java.sql.Timestamp;
import java.util.List;

import static com.example.auth.utils.DateUtils.stringToLocalDate;

public class BookMapper {
    public static BookResponse toResponse(Book existingBook) {
        return BookResponse.builder()
                .id(existingBook.getId())
                .title(existingBook.getTitle())
                .author(existingBook.getAuthor())
                .description(existingBook.getDescription())
                .image(existingBook.getImage())
                .insertedBy(existingBook.getInsertedBy())
                .createdAt(stringToLocalDate(existingBook.getCreatedAt()))
                .updatedAt(stringToLocalDate(existingBook.getUpdatedAt()))
                .build();
    }

    public static List<BookResponse> toListResponse(List<Book> all) {
        return all.stream().map(BookMapper::toResponse).toList();
    }

    public static Book requestPostToDomain(BookPostRequest book) {
        return Book.builder()
                .title(book.title())
                .author(book.author())
                .description(book.description())
                .image(book.image())
                .insertedBy(book.insertedBy())
                .createdAt(Timestamp.from(java.time.Instant.now()))
                .build();
    }

    public static Book requestPutToDomain(BookPutRequest book) {
        return Book.builder()
                .id(book.id())
                .title(book.title())
                .author(book.author())
                .description(book.description())
                .image(book.image())
                .updatedAt(Timestamp.from(java.time.Instant.now()))
                .build();
    }
}
