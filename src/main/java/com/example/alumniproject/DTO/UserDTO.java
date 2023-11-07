package com.example.alumniproject.DTO;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private String email;

    private String firstName;

    private String lastName;

    private String password;

    private ProfileDTO profile;
    
    private List<RoleDTO> roles;
}
