package com.example.alumniproject.service;

import com.example.alumniproject.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    boolean isUserLockedOut(User user);
    void lockUserAccount(User user);
    void save(User user);
    List<User> findAll();
    Optional<User> findById(Integer id);
    Optional<User> findByFirstName(String username);
}
