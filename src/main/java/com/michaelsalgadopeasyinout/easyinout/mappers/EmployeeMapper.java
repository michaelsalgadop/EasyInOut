package com.michaelsalgadopeasyinout.easyinout.mappers;

import com.michaelsalgadopeasyinout.easyinout.dtos.employee.CreateEmployeeDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.employee.GetFullEmployeeDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.employee.GetShortEmployeeDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.employee.UpdateEmployeeDTO;
import com.michaelsalgadopeasyinout.easyinout.entities.Company;
import com.michaelsalgadopeasyinout.easyinout.entities.Department;
import com.michaelsalgadopeasyinout.easyinout.entities.Employee;
import com.michaelsalgadopeasyinout.easyinout.entities.User;
import com.michaelsalgadopeasyinout.easyinout.exceptions.NotFoundException;

public class EmployeeMapper {
    // Mapeo de Empleado al Get de empleados con la información justa para devolver los datos que queremos.
    public static GetShortEmployeeDTO toShortEmployeeDTO(Employee employee){
        if (employee == null) {
            return null;
        }
        return GetShortEmployeeDTO.builder()
            .id(employee.getId())
            .firstName(employee.getFirstName())
            .lastName(employee.getLastName())
            .dni(employee.getDni())
            .active(employee.isActive())
            .build();
    }
    public static GetFullEmployeeDTO toFullEmployeeDTO(Employee employee){
        if (employee == null) {
            return null;
        }
        var department = DepartmentMapper.toDTO(employee.getDepartment());
        if (department == null) {
            throw new NotFoundException("Departamento no encontrado");
        }

        var user = UserMapper.toShortUserDTO(employee.getUser());
        if (user == null) {
            throw new NotFoundException("Usuario no encontrado");
        }

        var company = CompanyMapper.toDTO(employee.getCompany());
        if (company == null) {
            throw new NotFoundException("Empresa no encontrada");
        }

        return GetFullEmployeeDTO.builder()
            .id(employee.getId())
            .firstName(employee.getFirstName())
            .lastName(employee.getLastName())
            .dni(employee.getDni())
            .phone(employee.getPhone())
            .hireDate(employee.getHireDate())
            .active(employee.isActive())
            .department(department)
            .user(user)
            .company(company)
            .createdAt(employee.getCreatedAt())
            .updatedAt(employee.getUpdatedAt())
            .build();
    }
    public static Employee toEntity(CreateEmployeeDTO employee, Department department, User user, Company company){
        if (employee == null) {
            return null;
        }

        return Employee.builder()
            .firstName(employee.getFirstName())
            .lastName(employee.getLastName())
            .dni(employee.getDni())
            .phone(employee.getPhone())
            .hireDate(employee.getHireDate())
            .department(department)
            .user(user)
            .company(company)
            .build();
    }
    public static Employee toEntity(UpdateEmployeeDTO employee, Department department, User user, Company company){
        if (employee == null) {
            return null;
        }

        return Employee.builder()
            .id(employee.getId())
            .firstName(employee.getFirstName())
            .lastName(employee.getLastName())
            .dni(employee.getDni())
            .phone(employee.getPhone())
            .hireDate(employee.getHireDate())
            .active(employee.isActive())
            .department(department)
            .user(user)
            .company(company)
            .build();
    }
}
