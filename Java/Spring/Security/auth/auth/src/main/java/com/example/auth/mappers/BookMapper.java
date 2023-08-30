package com.example.auth.mappers;

import com.example.auth.domain.books.Books;
import com.example.auth.domain.books.request.BookPostRequest;
import com.example.auth.domain.books.request.BookPutRequest;
import com.example.auth.domain.books.response.BookResponse;

import java.util.List;

import static com.example.auth.utils.DateUtils.stringToLocalDate;

public class BookMapper {
    public static BookResponse toResponse(Books existingBook) {
        return BookResponse.builder()
                .id(existingBook.getId())
                .title(existingBook.getTitle())
                .author(existingBook.getAuthor())
                .description(existingBook.getDescription())
                .image(existingBook.getImage())
//                .inserted_by(existingBook.getInserted_by())
                .created_at(stringToLocalDate(existingBook.getCreated_at()))
                .updated_at(stringToLocalDate(existingBook.getUpdated_at()))
                .build();
    }

    public static List<BookResponse> toListResponse(List<Books> all) {
        return all.stream().map(BookMapper::toResponse).toList();
    }

    public static Books requestPostToDomain(BookPostRequest book) {
        return Books.builder()
                .title(book.getTitle())
                .author(book.getAuthor())
                .description(book.getDescription())
                .image(book.getImage())
                .build();
    }

    public static Books requestPutToDomain(BookPutRequest book) {
        return Books.builder()
                .id(book.getId())
                .title(book.getTitle())
                .author(book.getAuthor())
                .description(book.getDescription())
                .image(book.getImage())
                .build();
    }
}
