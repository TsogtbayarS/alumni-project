package com.example.alumniproject.service;

import com.example.alumniproject.dto.JobDTO;
import com.example.alumniproject.entity.Job;

import java.util.List;

public interface JobService {
    void saveJob(String email, JobDTO job);
    List<Job> findAll();
    List<Job> findJobByOrganization(String organization);

    List<Job> findJobByLocationState(String state);

    List<Job> findJobByLocationCity(String city);

    List<Job> findJobsByFilter(String organization, String state, String city);
}
