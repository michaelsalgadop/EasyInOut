package com.michaelsalgadopeasyinout.easyinout.dtos.user;

import java.time.LocalDateTime;
import java.util.Set;

import com.michaelsalgadopeasyinout.easyinout.dtos.employee.GetShortEmployeeDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.rol.GetRolDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetFullUserDTO {
    private Long id;
    private String username;
    private String email;
    private GetShortEmployeeDTO employee;
    private boolean enabled;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Set<GetRolDTO> roles;
}
