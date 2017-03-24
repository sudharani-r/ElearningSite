package com.elearning.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.elearning.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {
 
}
