package com.michaelsalgadopeasyinout.easyinout.services.department;

import java.util.List;

import com.michaelsalgadopeasyinout.easyinout.dtos.department.CreateDepartmentDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.department.GetDepartmentDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.department.UpdateDepartmentDTO;

public interface IDepartmentService {
    List<GetDepartmentDTO> getDepartments();
    GetDepartmentDTO getDepartmentById(Long id);
    GetDepartmentDTO createDepartment(CreateDepartmentDTO departmentDTO);
    GetDepartmentDTO updateDepartment(Long id, UpdateDepartmentDTO departmentDTO);
    void deleteDepartment(Long id);
}
