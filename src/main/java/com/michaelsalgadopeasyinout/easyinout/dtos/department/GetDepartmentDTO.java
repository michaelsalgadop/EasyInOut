package com.michaelsalgadopeasyinout.easyinout.dtos.department;

import com.michaelsalgadopeasyinout.easyinout.dtos.company.GetCompanyDTO;

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
    private GetCompanyDTO company;
}
