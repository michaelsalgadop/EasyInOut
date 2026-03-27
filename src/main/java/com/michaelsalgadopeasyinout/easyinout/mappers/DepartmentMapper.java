package com.michaelsalgadopeasyinout.easyinout.mappers;

import com.michaelsalgadopeasyinout.easyinout.dtos.department.GetDepartmentDTO;
import com.michaelsalgadopeasyinout.easyinout.entities.Department;
import com.michaelsalgadopeasyinout.easyinout.exceptions.NotFoundException;

public class DepartmentMapper {
    // Mapeo de Departamento al Get de departamentos para devolver los datos que queremos.
    public static GetDepartmentDTO getDepartmentDTO(Department department){
        if (department == null) {
            return null;
        }
        var company = CompanyMapper.getCompanyDTO(department.getCompany());
        if (company == null) {
            throw new NotFoundException("Empresa no encontrada");
        }
        return GetDepartmentDTO.builder()
                .id(department.getId())
                .name(department.getName())
                .description(department.getDescription())
                .company(company)
                .build();
    }
}
