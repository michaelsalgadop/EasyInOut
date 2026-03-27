package com.michaelsalgadopeasyinout.easyinout.mappers;

import java.util.stream.Collectors;

import com.michaelsalgadopeasyinout.easyinout.dtos.rol.GetRolDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.user.GetFullUserDTO;
import com.michaelsalgadopeasyinout.easyinout.entities.User;
import com.michaelsalgadopeasyinout.easyinout.exceptions.NotFoundException;

public class UserMapper {
    public static GetFullUserDTO getFullUserDTO (User user) {
        if (user == null) {
            return null;
        }
        var roles = user.getRoles().stream().map(rol -> 
	        GetRolDTO.builder()
            .id(rol.getId())
            .name(rol.getName())
            .description(rol.getDescription())
            .build()
        ).collect(Collectors.toUnmodifiableSet());
        var employee = EmployeeMapper.getShortEmployeeDTO(user.getEmployee());
        if (employee == null) {
            throw new NotFoundException("Empleado no encontrado");            
        }
        return GetFullUserDTO.builder()
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .employee(employee)
                .enabled(user.isEnabled())
                .createdAt(user.getCreatedAt())
                .updatedAt(user.getUpdatedAt())
                .roles(roles)
                .build();
    }
}
