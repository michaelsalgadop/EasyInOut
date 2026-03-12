package com.michaelsalgadopeasyinout.easyinout.services.company;

import java.util.List;

import com.michaelsalgadopeasyinout.easyinout.dto.company.CreateUpdateCompanyDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.company.GetCompanyDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.department.GetDepartmentDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.employee.GetShortEmployeeDTO;

public interface ICompanyService {
    List<GetCompanyDTO> getCompanies();
    GetCompanyDTO getCompanyById(Long id);
    GetCompanyDTO createCompany(CreateUpdateCompanyDTO companyDTO);
    GetCompanyDTO updateCompany(Long id, CreateUpdateCompanyDTO companyDTO);
    void deleteCompany(Long id);
    List<GetShortEmployeeDTO> getEmployeesByIdCompany(Long id);
    List<GetDepartmentDTO> getDepartmentsByIdCompany(Long id);
}
