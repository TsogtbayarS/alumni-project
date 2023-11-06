package com.example.alumniproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User extends BaseEntity {

    private String email;

    private String firstName;

    private String lastName;

    private String password;

    @OneToOne
    private Profile profile;
}
