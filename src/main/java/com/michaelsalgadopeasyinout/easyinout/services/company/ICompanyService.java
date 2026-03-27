package com.michaelsalgadopeasyinout.easyinout.services.company;

import java.util.List;

import com.michaelsalgadopeasyinout.easyinout.dtos.company.CreateCompanyDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.company.GetCompanyDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.company.UpdateCompanyDTO;

public interface ICompanyService {
    List<GetCompanyDTO> getCompanies();
    GetCompanyDTO getCompanyById(Long id);
    GetCompanyDTO createCompany(CreateCompanyDTO companyDTO);
    GetCompanyDTO updateCompany(Long id, UpdateCompanyDTO companyDTO);
    void deleteCompany(Long id);
}
