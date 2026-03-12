package com.michaelsalgadopeasyinout.easyinout.services.company;

import java.util.List;

import org.springframework.stereotype.Service;

import com.michaelsalgadopeasyinout.easyinout.dto.company.CreateUpdateCompanyDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.company.GetCompanyDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.department.GetDepartmentDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.employee.GetShortEmployeeDTO;

@Service
public class CompanyService implements ICompanyService{

    @Override
    public List<GetCompanyDTO> getCompanies() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCompanies'");
    }

    @Override
    public GetCompanyDTO getCompanyById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCompanyById'");
    }

    @Override
    public GetCompanyDTO createCompany(CreateUpdateCompanyDTO companyDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createCompany'");
    }

    @Override
    public GetCompanyDTO updateCompany(Long id, CreateUpdateCompanyDTO companyDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCompany'");
    }

    @Override
    public void deleteCompany(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCompany'");
    }

    @Override
    public List<GetShortEmployeeDTO> getEmployeesByIdCompany(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEmployeesByIdCompany'");
    }

    @Override
    public List<GetDepartmentDTO> getDepartmentsByIdCompany(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDepartmentsByIdCompany'");
    }

}
