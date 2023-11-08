package com.example.alumniproject.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfileDTO {
    private String phoneNumber;
    private String major;

    private List<EducationDTO> education;

    private List<AchievementDTO> achievements;

    private List<JobDTO> jobs;

    private LocationDTO location;

    private String profileImage;
}
