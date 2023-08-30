package com.example.auth.domain.books.response;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookResponse {
    private Integer id;
    private String title;
    private String author;
    private String description;
    private String image;
//    private Integer inserted_by;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
