package com.example.alumniproject.service;

import com.example.alumniproject.entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {

    ResponseEntity<?> loginUser(String username, String password);
    boolean isUserLockedOut(User user);
    void lockUserAccount(User user);
    void save(User user);
    List<User> findAll();
    Optional<User> findById(Long id);
    Optional<User> findByFirstName(String username);


    User changeActive(Long userId);
}
