package com.michaelsalgadopeasyinout.easyinout.services.absencetype;

import java.util.List;

import com.michaelsalgadopeasyinout.easyinout.dtos.absencetype.CreateAbsenceTypeDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.absencetype.GetAbsenceTypeDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.absencetype.UpdateAbsenceTypeDTO;

public interface IAbsenceTypeService {
    List<GetAbsenceTypeDTO> getAbsenceTypes();
    GetAbsenceTypeDTO getAbsenceTypesById(Long id);
    GetAbsenceTypeDTO createAbsenceType(CreateAbsenceTypeDTO absenceTypeDTO);
    GetAbsenceTypeDTO updateAbsenceType(Long id, UpdateAbsenceTypeDTO absenceTypeDTO);
    void deleteAbsenceType(Long id);
}
