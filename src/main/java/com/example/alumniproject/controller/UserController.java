package com.example.alumniproject.controller;

import com.example.alumniproject.DTO.RegistrationDTO;
import com.example.alumniproject.DTO.UserDTO;
import com.example.alumniproject.entity.User;
import com.example.alumniproject.service.RegistrationService;
import com.example.alumniproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService service;
    private final RegistrationService registrationService;

    @GetMapping("")
    public List<User> getUsers() {
        return service.findAll();
    }

    @GetMapping("/{userId}")
    public Optional<User> getUser(@PathVariable Long userId) {
        return service.findById(userId);
    }

    @PostMapping("")
    public UserDTO addUser(@RequestBody RegistrationDTO registrationDTO) throws IllegalArgumentException {
        return registrationService.register(registrationDTO);


    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestParam String username, @RequestParam String password) {
        return service.loginUser(username,password);
    }
}
