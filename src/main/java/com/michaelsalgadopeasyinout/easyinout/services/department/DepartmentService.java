package com.michaelsalgadopeasyinout.easyinout.services.department;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michaelsalgadopeasyinout.easyinout.dtos.department.CreateDepartmentDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.department.GetDepartmentDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.department.UpdateDepartmentDTO;
import com.michaelsalgadopeasyinout.easyinout.exceptions.NotFoundException;
import com.michaelsalgadopeasyinout.easyinout.mappers.DepartmentMapper;
import com.michaelsalgadopeasyinout.easyinout.repositories.CompanyRepository;
import com.michaelsalgadopeasyinout.easyinout.repositories.DepartmentRepository;

@Service
public class DepartmentService implements IDepartmentService {
    @Autowired
    private  DepartmentRepository repository;
    @Autowired
    private CompanyRepository companyRepository;
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
    public GetDepartmentDTO createDepartment(CreateDepartmentDTO departmentDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createDepartment'");
    }

    @Override
    public GetDepartmentDTO updateDepartment(Long id, UpdateDepartmentDTO departmentDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateDepartment'");
    }

    @Override
    public void deleteDepartment(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteDepartment'");
    }

    @Override
    public List<GetDepartmentDTO> getDepartmentsByIdCompany(Long idCompany) {
        if (!companyRepository.existsById(idCompany)) {
            throw new NotFoundException("Empresa no encontrada");   
        }
        return repository.findByIdCompany(idCompany).stream().map(DepartmentMapper::getDepartmentDTO).toList();
    }

}
