package com.example.alumniproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Collection;

@Entity
@Getter
@Setter
public class User extends BaseEntity {

    private String email;

    private String firstName;

    private String lastName;

    private String password;

    private int failedLoginAttempts;

    private LocalDateTime lastFailedLoginTimestamp;

    private Boolean accountLocked;

    private String token;

    @OneToOne
    private Profile profile;

    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;
}
