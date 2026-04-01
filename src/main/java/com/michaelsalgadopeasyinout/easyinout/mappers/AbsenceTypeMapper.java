package com.michaelsalgadopeasyinout.easyinout.mappers;

import com.michaelsalgadopeasyinout.easyinout.dtos.absencetype.CreateAbsenceTypeDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.absencetype.GetAbsenceTypeDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.absencetype.UpdateAbsenceTypeDTO;
import com.michaelsalgadopeasyinout.easyinout.entities.AbsenceType;

public class AbsenceTypeMapper {
    // Mapeo de Ausencias al Get de ausencias para devolver los datos que queremos.
    public static GetAbsenceTypeDTO toDTO(AbsenceType absenceType){
        if (absenceType == null) {
            return null;
        }
        return GetAbsenceTypeDTO.builder()
            .id(absenceType.getId())
            .name(absenceType.getName())
            .description(absenceType.getDescription())
            .build();
    }
    // Mapeo de tipo de Ausencia a su DTO preparado para crear
    public static AbsenceType toEntity(CreateAbsenceTypeDTO absenceType){
        if (absenceType == null) {
            return null;
        }
        return AbsenceType.builder()
            .name(absenceType.getName())
            .description(absenceType.getDescription())
            .build();
    }
    // Mapeo de Ausencia a su DTO preparado para modificar
    public static AbsenceType toEntity(UpdateAbsenceTypeDTO absenceType){
        if (absenceType == null) {
            return null;
        }
        return AbsenceType.builder()
            .id(absenceType.getId())
            .name(absenceType.getName())
            .description(absenceType.getDescription())
            .requiresApproval(absenceType.isRequiresApproval())
            .build();
    }
}
