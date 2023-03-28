package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Genre;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface IGenreRepository extends MongoRepository<Genre,String> {

    Optional<Genre> findOptionalByName(String name);

    List<Genre> findAllByIdIn(List<String> genreIds);
}
