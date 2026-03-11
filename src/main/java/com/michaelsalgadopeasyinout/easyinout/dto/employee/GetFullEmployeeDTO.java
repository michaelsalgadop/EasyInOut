package com.michaelsalgadopeasyinout.easyinout.dto.employee;

import java.time.LocalDateTime;

import com.michaelsalgadopeasyinout.easyinout.dto.department.GetDepartmentDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.user.GetShortUserDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetFullEmployeeDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private int phone;
    private LocalDateTime hireDate;
    private boolean active;
    private GetDepartmentDTO department;
    private GetShortUserDTO user;
}
