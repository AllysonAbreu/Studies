package com.example.auth.domain.books.request;

public record BookPutRequest (Integer id, String title, String author, String description, String image) {
}
