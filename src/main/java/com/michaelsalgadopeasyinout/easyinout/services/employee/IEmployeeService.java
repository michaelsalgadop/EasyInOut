package com.michaelsalgadopeasyinout.easyinout.services.employee;

import java.util.List;

import com.michaelsalgadopeasyinout.easyinout.dtos.employee.CreateEmployeeDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.employee.GetFullEmployeeDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.employee.GetShortEmployeeDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.employee.UpdateEmployeeDTO;

public interface IEmployeeService {
    List<GetShortEmployeeDTO> getEmployees();
    GetFullEmployeeDTO getEmployeeById(Long id);
    GetShortEmployeeDTO createEmployee(CreateEmployeeDTO employeeDTO);
    GetShortEmployeeDTO updateEmployee(Long id, UpdateEmployeeDTO employeeDTO);
    void deleteEmployee(Long id);
}
