package com.example.alumniproject.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Location {
    private String country;
    private String state;
    private String street;
    private int zip;
    private String city;

}
