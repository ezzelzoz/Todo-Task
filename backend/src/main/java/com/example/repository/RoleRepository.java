package com.example.repository;

import com.example.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import java.util.Optional;

public interface RoleRepository extends ReactiveMongoRepository<Role,Integer> {
    Optional<Role>findByName(String name);
}
