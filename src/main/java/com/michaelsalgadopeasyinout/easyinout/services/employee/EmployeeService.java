package com.michaelsalgadopeasyinout.easyinout.services.employee;

import java.util.List;

import org.springframework.stereotype.Service;

import com.michaelsalgadopeasyinout.easyinout.dtos.employee.CreateEmployeeDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.employee.GetFullEmployeeDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.employee.GetShortEmployeeDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.employee.UpdateEmployeeDTO;

@Service
public class EmployeeService implements IEmployeeService{

    @Override
    public GetShortEmployeeDTO createEmployee(CreateEmployeeDTO employeeDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createEmployee'");
    }

    @Override
    public GetShortEmployeeDTO updateEmployee(Long id, UpdateEmployeeDTO employeeDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateEmployee'");
    }

    @Override
    public void deleteEmployee(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteEmployee'");
    }

    @Override
    public List<GetShortEmployeeDTO> getEmployees() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEmployees'");
    }

    @Override
    public GetFullEmployeeDTO getEmployeeById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEmployeeById'");
    }

}
