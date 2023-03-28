package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Genre;
import com.bilgeadam.repository.entity.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface IMovieRepository extends MongoRepository<Movie,String> {

    Optional<Movie> findOptionalByNameIgnoreCase(String name);

    List<Movie> findAllByGenresIn(List<Genre> genres);
}
