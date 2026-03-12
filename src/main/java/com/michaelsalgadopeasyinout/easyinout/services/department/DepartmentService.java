package com.michaelsalgadopeasyinout.easyinout.services.department;

import java.util.List;

import org.springframework.stereotype.Service;

import com.michaelsalgadopeasyinout.easyinout.dto.department.CreateUpdateDepartmentDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.department.GetDepartmentDTO;

@Service
public class DepartmentService implements IDepartmentService {

    @Override
    public List<GetDepartmentDTO> getDepartments() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDepartments'");
    }

    @Override
    public GetDepartmentDTO getDepartmentById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDepartmentById'");
    }

    @Override
    public GetDepartmentDTO createDepartment(CreateUpdateDepartmentDTO departmentDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createDepartment'");
    }

    @Override
    public GetDepartmentDTO updateDepartment(Long id, CreateUpdateDepartmentDTO departmentDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateDepartment'");
    }

    @Override
    public void deleteDepartment(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteDepartment'");
    }

}
