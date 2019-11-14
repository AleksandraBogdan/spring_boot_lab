package com.epam.springLabEpam.dto;

import com.epam.springLabEpam.model.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserDto {

    private int id;
    private String name;
    private String surname;
    private String email;
    private String subscription;
    private Role role;
}
