package com.example.alumniproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Getter
@Setter
public class Profile extends BaseEntity{

    private String phoneNumber;
    private String major;

    @OneToOne
    private Education education;

    @Fetch(FetchMode.SELECT)
    @JoinColumn(name = "profile_id")
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private List<Achievement> achievements;

    private String profileImage;

}
