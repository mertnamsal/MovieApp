package com.bilgeadam.repository.entity;

import com.bilgeadam.repository.entity.Movie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Document
public class MovieComment extends BaseEntity{
    @Id
    private Long id;

    private String content;
    @Builder.Default
    private LocalDate date=LocalDate.now();

    private Long userId;

    private Movie movie;

}