package com.michaelsalgadopeasyinout.easyinout.services.absence;

import java.util.List;

import com.michaelsalgadopeasyinout.easyinout.dto.absence.CreateAbsenceDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.absence.GetAbsenceDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.absence.UpdateAbsenceDTO;

public interface IAbsenceService {
    List<GetAbsenceDTO> getAbsences();
    GetAbsenceDTO getAbsenceById(Long id);
    GetAbsenceDTO createAbsence(CreateAbsenceDTO absenceDTO);
    GetAbsenceDTO updateAbsence(Long id, UpdateAbsenceDTO absenceDTO);
    void deleteAbsence(Long id);
}
