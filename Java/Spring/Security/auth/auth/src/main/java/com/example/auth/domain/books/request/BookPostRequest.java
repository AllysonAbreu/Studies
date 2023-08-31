package com.example.auth.domain.books.request;

public record BookPostRequest (String title, String author, String description, String image, Integer insertedBy) {
}
