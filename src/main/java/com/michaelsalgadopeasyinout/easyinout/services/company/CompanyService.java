package com.michaelsalgadopeasyinout.easyinout.services.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michaelsalgadopeasyinout.easyinout.dtos.company.CreateCompanyDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.company.GetCompanyDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.company.UpdateCompanyDTO;
import com.michaelsalgadopeasyinout.easyinout.entities.Company;
import com.michaelsalgadopeasyinout.easyinout.exceptions.BusinessException;
import com.michaelsalgadopeasyinout.easyinout.exceptions.NotFoundException;
import com.michaelsalgadopeasyinout.easyinout.mappers.CompanyMapper;
import com.michaelsalgadopeasyinout.easyinout.repositories.CompanyRepository;

@Service
public class CompanyService implements ICompanyService{
    @Autowired
    private  CompanyRepository repository;
    @Override
    public List<GetCompanyDTO> getCompanies() {
        return repository.findAll().stream().map(CompanyMapper::toDTO).toList();
    }

    @Override
    public GetCompanyDTO getCompanyById(Long id) {
        return repository.findById(id).map(CompanyMapper::toDTO).orElseThrow(() -> new NotFoundException("Compañia no encontrada"));
    }

    @Override
    public GetCompanyDTO createCompany(CreateCompanyDTO companyDTO) {
        if(repository.existsByName(companyDTO.getName())) {
            throw new BusinessException("Empresa ya existe");
        }
        var company =   Company.builder()
                        .name(companyDTO.getName())
                        .build();
        return CompanyMapper.toDTO(repository.save(company));
    }

    @Override
    public GetCompanyDTO updateCompany(Long id, UpdateCompanyDTO companyDTO) {
        var company = repository.findById(id).orElseThrow(() -> new NotFoundException("Compañía no encontrada."));
        company.setName(companyDTO.getName());
        return CompanyMapper.toDTO(repository.save(company));
    }

    @Override
    public void deleteCompany(Long id) {
        var company = repository.findById(id).orElseThrow(() -> new NotFoundException("Compañía no encontrada."));
        repository.delete(company);
    }
}
