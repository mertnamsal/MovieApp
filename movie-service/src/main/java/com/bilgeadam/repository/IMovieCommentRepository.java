package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.MovieComment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IMovieCommentRepository extends MongoRepository<MovieComment,String> {
}
