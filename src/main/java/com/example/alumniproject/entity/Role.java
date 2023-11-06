package com.example.alumniproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Entity
@Getter
@Setter
public class Role extends BaseEntity {
    private String name;

    @ManyToMany(mappedBy = "roles")
    private Collection<User> users;
}
