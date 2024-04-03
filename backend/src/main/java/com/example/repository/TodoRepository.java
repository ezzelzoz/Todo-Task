package com.example.repository;

import com.example.model.Todo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends ReactiveMongoRepository<Todo,String> {
    
}
