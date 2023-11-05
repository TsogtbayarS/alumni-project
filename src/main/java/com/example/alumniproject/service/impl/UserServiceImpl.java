package com.example.alumniproject.service.impl;

import com.example.alumniproject.entity.User;
import com.example.alumniproject.repository.UserRepo;
import com.example.alumniproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo repository;

    @Override
    public void save(User user) {
        repository.save(user);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<User> findById(Integer id) {
        return repository.findById(id);
    }
}
