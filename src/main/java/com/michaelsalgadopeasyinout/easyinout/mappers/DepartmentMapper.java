package com.michaelsalgadopeasyinout.easyinout.mappers;

import com.michaelsalgadopeasyinout.easyinout.dtos.department.CreateDepartmentDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.department.GetDepartmentDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.department.UpdateDepartmentDTO;
import com.michaelsalgadopeasyinout.easyinout.entities.Company;
import com.michaelsalgadopeasyinout.easyinout.entities.Department;
import com.michaelsalgadopeasyinout.easyinout.exceptions.NotFoundException;

public class DepartmentMapper {
    // Mapeo de Departamento al Get de departamentos para devolver los datos que queremos.
    public static GetDepartmentDTO toDTO(Department department){
        if (department == null) {
            return null;
        }
        var company = CompanyMapper.toDTO(department.getCompany());
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
    public static Department toEntity(CreateDepartmentDTO department, Company company){
        if (department == null) {
            return null;
        }
        return Department.builder()
            .name(department.getName())
            .description(department.getDescription())
            .company(company)
            .build();
    }
    public static Department toEntity(UpdateDepartmentDTO department, Company company){
        if (department == null) {
            return null;
        }
        return Department.builder()
            .id(department.getId())
            .name(department.getName())
            .description(department.getDescription())
            .company(company)
            .build();
    }
}
