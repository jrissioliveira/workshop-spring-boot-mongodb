package com.jr.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jr.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post,String> {

	
}
