package com.michaelsalgadopeasyinout.easyinout.services.company;

import java.util.List;

import com.michaelsalgadopeasyinout.easyinout.dtos.company.CreateCompanyDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.company.GetCompanyDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.company.UpdateCompanyDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.department.GetDepartmentDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.employee.GetShortEmployeeDTO;

public interface ICompanyService {
    List<GetCompanyDTO> getCompanies();
    GetCompanyDTO getCompanyById(Long id);
    GetCompanyDTO createCompany(CreateCompanyDTO companyDTO);
    GetCompanyDTO updateCompany(Long id, UpdateCompanyDTO companyDTO);
    void deleteCompany(Long id);
    List<GetShortEmployeeDTO> getEmployeesByIdCompany(Long id);
    List<GetDepartmentDTO> getDepartmentsByIdCompany(Long id);
}
