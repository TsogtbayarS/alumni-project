package com.example.alumniproject.repository;

import com.example.alumniproject.entity.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends ListCrudRepository<User, Integer> {
    @Override
    List<User> findAll();
    @Override
    Optional<User> findById(Integer id);
    Optional<User> findByFirstName(String name);
}
