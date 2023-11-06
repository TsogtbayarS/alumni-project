package com.example.alumniproject.service;

import com.example.alumniproject.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void save(User user);

    List<User> findAll();

    Optional<User> findById(Integer id);
}
