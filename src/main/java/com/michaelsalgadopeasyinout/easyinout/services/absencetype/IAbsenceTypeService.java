package com.michaelsalgadopeasyinout.easyinout.services.absencetype;

import java.util.List;

import com.michaelsalgadopeasyinout.easyinout.dto.absencetype.CreateAbsenceTypeDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.absencetype.GetAbsenceTypeDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.absencetype.UpdateAbsenceTypeDTO;

public interface IAbsenceTypeService {
    List<GetAbsenceTypeDTO> getAbsenceTypes();
    GetAbsenceTypeDTO getAbsenceTypesById(Long id);
    GetAbsenceTypeDTO createAbsenceType(CreateAbsenceTypeDTO absenceTypeDTO);
    GetAbsenceTypeDTO updateAbsenceType(Long id, UpdateAbsenceTypeDTO absenceTypeDTO);
    void deleteAbsenceType(Long id);
}
