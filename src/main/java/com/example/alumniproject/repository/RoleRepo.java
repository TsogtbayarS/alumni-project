package com.example.alumniproject.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.alumniproject.entity.Role;
import java.util.Optional;


@Repository
public interface RoleRepo extends ListCrudRepository<Role, Long> {
    public Optional<Role> findFirstByName(String name);
}
