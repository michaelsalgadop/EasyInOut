package com.michaelsalgadopeasyinout.easyinout.services.absence;

import java.util.List;

import org.springframework.stereotype.Service;

import com.michaelsalgadopeasyinout.easyinout.dto.absence.CreateAbsenceDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.absence.GetAbsenceDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.absence.UpdateAbsenceDTO;

@Service
public class AbsenceService implements IAbsenceService {

    @Override
    public List<GetAbsenceDTO> getAbsences() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAbsences'");
    }

    @Override
    public GetAbsenceDTO getAbsenceById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAbsenceById'");
    }

    @Override
    public GetAbsenceDTO createAbsence(CreateAbsenceDTO absenceDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createAbsence'");
    }

    @Override
    public GetAbsenceDTO updateAbsence(Long id, UpdateAbsenceDTO absenceDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAbsence'");
    }

    @Override
    public void deleteAbsence(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAbsence'");
    }
    
}
