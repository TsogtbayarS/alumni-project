package com.example.alumniproject.service;

import java.util.List;

import com.example.alumniproject.DTO.AchievementDTO;
import com.example.alumniproject.DTO.CourseDTO;
import com.example.alumniproject.DTO.EducationDTO;
import com.example.alumniproject.DTO.JobDTO;
import com.example.alumniproject.DTO.LocationDTO;
import com.example.alumniproject.DTO.ProfileDTO;
import com.example.alumniproject.DTO.RegistrationDTO;
import com.example.alumniproject.DTO.RoleDTO;
import com.example.alumniproject.DTO.UserDTO;
import com.example.alumniproject.entity.Achievement;
import com.example.alumniproject.entity.Course;
import com.example.alumniproject.entity.Education;
import com.example.alumniproject.entity.Job;
import com.example.alumniproject.entity.Location;
import com.example.alumniproject.entity.Profile;
import com.example.alumniproject.entity.Role;
import com.example.alumniproject.entity.User;

public interface RegistrationService {
    UserDTO register(RegistrationDTO registrationDTO);

    User userDTOToEntity(UserDTO userDTO);

    Profile profileDTOToEntity(ProfileDTO profileDTO);

    Role roleDTOToEntity(RoleDTO roleDTO);

    Education educationDTOToEntity(EducationDTO educationDTO);

    Location locationDTOToEntity(LocationDTO locationDTO);

    Course courseDTOToEntity(CourseDTO courseDTO);

    Job jobDTOToEntity(JobDTO jobDTO);

    Achievement achievementDTOToEntity(AchievementDTO achievementDTO);

    List<Role> roleDTOListToEntity(List<RoleDTO> roleDTOList);

    List<Education> educationDTOListToEntity(List<EducationDTO> educationDTOList);

    List<Course> courseDTOListToEntity(List<CourseDTO> courseDTOList);

    List<Job> jobDTOListToEntity(List<JobDTO> jobDTOList);

    List<Achievement> achievementDTOListToEntity(List<AchievementDTO> achievementDTOList);

    UserDTO entityToUserDTO(User user);
}
