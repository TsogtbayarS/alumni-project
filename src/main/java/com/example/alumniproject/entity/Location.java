package com.example.alumniproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Location {
    @Id
    private Long id;
    private String country;
    private String state;
    private String street;
    private int zip;
    private String city;

}
