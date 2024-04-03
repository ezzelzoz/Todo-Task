package com.example.repository;

import com.example.model.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import java.util.Optional;

public interface UserRepository extends ReactiveMongoRepository<UserEntity,String> {
    Optional<UserEntity> findByUsername(String username);
    Boolean existByUsername(String username);
}
