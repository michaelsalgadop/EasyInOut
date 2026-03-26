package com.michaelsalgadopeasyinout.easyinout.services.absencetype;

import java.util.List;

import org.springframework.stereotype.Service;

import com.michaelsalgadopeasyinout.easyinout.dtos.absencetype.CreateAbsenceTypeDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.absencetype.GetAbsenceTypeDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.absencetype.UpdateAbsenceTypeDTO;

@Service
public class AbsenceTypeService implements IAbsenceTypeService{

    @Override
    public List<GetAbsenceTypeDTO> getAbsenceTypes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAbsenceTypes'");
    }

    @Override
    public GetAbsenceTypeDTO getAbsenceTypesById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAbsenceTypesById'");
    }

    @Override
    public GetAbsenceTypeDTO createAbsenceType(CreateAbsenceTypeDTO absenceDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createAbsenceType'");
    }

    @Override
    public GetAbsenceTypeDTO updateAbsenceType(Long id, UpdateAbsenceTypeDTO absenceDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAbsenceType'");
    }

    @Override
    public void deleteAbsenceType(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAbsenceType'");
    }

}
