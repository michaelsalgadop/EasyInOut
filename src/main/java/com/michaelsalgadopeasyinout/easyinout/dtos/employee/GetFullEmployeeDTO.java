package com.michaelsalgadopeasyinout.easyinout.dtos.employee;

import java.time.LocalDateTime;

import com.michaelsalgadopeasyinout.easyinout.dtos.company.GetCompanyDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.department.GetDepartmentDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.user.GetShortUserDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetFullEmployeeDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String dni;
    private int phone;
    private LocalDateTime hireDate;
    private boolean active;
    private GetDepartmentDTO department;
    private GetShortUserDTO user;
    private GetCompanyDTO company;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
