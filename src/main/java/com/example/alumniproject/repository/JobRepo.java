package com.example.alumniproject.repository;

import com.example.alumniproject.entity.Job;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends ListCrudRepository<Job, Long> {
    List<Job> getJobsByOrganization(String organization);

    List<Job> getJobsByLocationState(String state);

    List<Job> getJobsByLocationCity(String city);

}
