package com.michaelsalgadopeasyinout.easyinout.dtos.department;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateDepartmentDTO {
    @NotBlank(message = "Nombre invalido!")
    private String name;
    private String description;
    private Long companyId;
}
