package com.example.service;

import com.example.model.UserEntity;
import com.example.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public void addUser(UserEntity user) {
        //add check on username to check it is not repeated
        userRepository.save(user);
    }
}
