package com.michaelsalgadopeasyinout.easyinout.mappers;

import com.michaelsalgadopeasyinout.easyinout.dtos.employee.GetShortEmployeeDTO;
import com.michaelsalgadopeasyinout.easyinout.entities.Employee;

public class EmployeeMapper {
    // Mapeo de Empleado al Get de empleados para devolver los datos que queremos.
    public static GetShortEmployeeDTO getShortEmployeeDTO(Employee employee){
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
}
