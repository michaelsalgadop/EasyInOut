package com.michaelsalgadopeasyinout.easyinout.mappers;

import com.michaelsalgadopeasyinout.easyinout.dtos.company.CreateCompanyDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.company.GetCompanyDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.company.UpdateCompanyDTO;
import com.michaelsalgadopeasyinout.easyinout.entities.Company;

public class CompanyMapper {
    // Mapeo de Empresa al Get de empresas para devolver los datos que queremos.
    public static GetCompanyDTO toDTO(Company company){
        if (company == null) {
            return null;
        }
        return GetCompanyDTO.builder().id(company.getId()).name(company.getName()).build();
    }
    // Mapeo de DTO a su Entidad preparado para crear
    public static Company toEntity(CreateCompanyDTO dto){
        if (dto == null) {
            return null;
        }
        return Company.builder().name(dto.getName()).build();
    }
    // Mapeo de DTO a su Entidad preparado para modificar
    public static Company toEntity(UpdateCompanyDTO dto){
        if (dto == null) {
            return null;
        }
        return Company.builder().id(dto.getId()).name(dto.getName()).build();
    }
}
