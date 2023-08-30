package com.example.auth.domain.books;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.Timestamp;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode(of = "id")
@ToString(of = "id")
public class Books {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    private String title;
    private String author;
    private String description;
    private String image;
//    private Integer inserted_by;
    private Timestamp created_at;
    private Timestamp updated_at;
}
