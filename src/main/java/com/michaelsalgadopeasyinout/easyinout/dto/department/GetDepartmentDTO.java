package com.michaelsalgadopeasyinout.easyinout.dto.department;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetDepartmentDTO {
    private Long id;
    private String name;
    private String description;
}
