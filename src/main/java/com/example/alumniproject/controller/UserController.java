package com.example.alumniproject.controller;

import com.example.alumniproject.entity.User;
import com.example.alumniproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
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
    @PostMapping("")
    public void addUser(@RequestBody User user) {
        service.save(user);
    }
    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestParam String username, @RequestParam String password) {
        Optional<User> existingUser = service.findByFirstName(username);
        if (existingUser.isPresent()) {
            User user = existingUser.get();

            if (service.isUserLockedOut(user)) {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Account locked. Try again later 15 minutes later.");
            }

            if (user.getPassword().equals(password)) {
                return ResponseEntity.ok("Login successful");
            } else {
                user.setFailedLoginAttempts(user.getFailedLoginAttempts() + 1);
                user.setLastFailedLoginTimestamp(LocalDateTime.now());
                service.save(user);

                // Check if the user has reached the maximum login attempts
                if (user.getFailedLoginAttempts() >= 5) {
                    // Lock the user for 15 minutes
                    service.lockUserAccount(user);
                    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Account locked. Cause of too many failed attempts.");
                } else {
                    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
                }
            }
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User not found");
        }
    }
}
