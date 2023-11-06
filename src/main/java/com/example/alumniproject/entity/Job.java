package com.example.alumniproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Job extends BaseEntity {

    @OneToOne
    private Profile poster;

    private String title;

    private String description;

    private String organization;

    @OneToOne
    private Profile assigner;
}
