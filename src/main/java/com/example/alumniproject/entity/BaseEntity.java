package com.example.alumniproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date")
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modified_date")
    private Date modifiedDate;


    @PrePersist
    protected void onCreate() {
        this.createdDate = new Date();
        this.modifiedDate = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.modifiedDate = new Date();
    }
}
