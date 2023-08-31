package com.example.auth.domain.books;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.sql.Timestamp;

import static jakarta.persistence.GenerationType.IDENTITY;

@Table(name = "books")
@Entity(name = "books")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode(of = "id")
@ToString(of = "id")
public class Book {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    private String title;
    private String author;
    private String description;
    private String image;
    private Integer insertedBy;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
