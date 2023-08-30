package com.example.auth.domain.books.request;

import jakarta.validation.Valid;
import lombok.Getter;
import lombok.Setter;

@Valid
@Getter
@Setter
public class BookPostRequest {
    private String title;
    private String author;
    private String description;
    private String image;
}
