package com.michaelsalgadopeasyinout.easyinout.dto.user;

import java.time.LocalDateTime;
import java.util.Set;

import com.michaelsalgadopeasyinout.easyinout.dto.employee.GetShortEmployeeDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.rol.RolGetDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetFullUserDTO {
    private Long id;
    private String username;
    private GetShortEmployeeDTO employee;
    private boolean enabled;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Set<RolGetDTO> roles;
}
