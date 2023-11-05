package com.example.alumniproject.controller;

import com.example.alumniproject.entity.User;
import com.example.alumniproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService service;

    @GetMapping("")
    public List<User> getUsers() {
        return service.findAll();
    }

    @GetMapping("/{userId}")
    public Optional<User> getUser(@PathVariable int userId) {
        return service.findById(userId);
    }
}
