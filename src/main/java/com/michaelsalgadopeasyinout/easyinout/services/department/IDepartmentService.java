package com.michaelsalgadopeasyinout.easyinout.services.department;

import java.util.List;

import com.michaelsalgadopeasyinout.easyinout.dto.department.CreateUpdateDepartmentDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.department.GetDepartmentDTO;

public interface IDepartmentService {
    List<GetDepartmentDTO> getDepartments();
    GetDepartmentDTO getDepartmentById(Long id);
    GetDepartmentDTO createDepartment(CreateUpdateDepartmentDTO departmentDTO);
    GetDepartmentDTO updateDepartment(Long id, CreateUpdateDepartmentDTO departmentDTO);
    void deleteDepartment(Long id);
}
