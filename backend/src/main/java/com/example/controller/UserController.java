package com.example.controller;

import com.example.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/v1/todos") //edit it to register and login //it was todos and i edit it to users
@AllArgsConstructor

public class UserController {
    private final UserService userService;
//    @PostMapping
//    public void addUser(@RequestBody User user)
//    {
//        UserService.addUser(user);
//    }
}
