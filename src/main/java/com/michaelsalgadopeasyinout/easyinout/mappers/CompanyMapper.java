package com.michaelsalgadopeasyinout.easyinout.mappers;

import com.michaelsalgadopeasyinout.easyinout.dtos.company.CreateCompanyDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.company.GetCompanyDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.company.UpdateCompanyDTO;
import com.michaelsalgadopeasyinout.easyinout.entities.Company;

public class CompanyMapper {
    // Mapeo de Empresa al Get de empresas para devolver los datos que queremos.
    public static GetCompanyDTO getCompanyDTO(Company company){
        if (company == null) {
            return null;
        }
        return GetCompanyDTO.builder().id(company.getId()).name(company.getName()).build();
    }
    // Mapeo de Empresa a su DTO preparado para crear
    public static CreateCompanyDTO createCompanyDTO(Company company){
        if (company == null) {
            return null;
        }
        return CreateCompanyDTO.builder().name(company.getName()).build();
    }
    // Mapeo de Empresa a su DTO preparado para modificar
    public static UpdateCompanyDTO updateCompanyDTO(Company company){
        if (company == null) {
            return null;
        }
        return UpdateCompanyDTO.builder().id(company.getId()).name(company.getName()).build();
    }
}
