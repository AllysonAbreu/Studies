package com.example.auth.domain.books.response;

import lombok.*;

import java.time.LocalDateTime;

@Builder
public record BookResponse (Integer id, String title, String author, String description, String image, Integer insertedBy, LocalDateTime createdAt, LocalDateTime updatedAt){
}
