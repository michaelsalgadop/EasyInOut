package com.michaelsalgadopeasyinout.easyinout.mappers;

import com.michaelsalgadopeasyinout.easyinout.dtos.absence.CreateAbsenceDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.absence.GetAbsenceDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.absence.UpdateAbsenceDTO;
import com.michaelsalgadopeasyinout.easyinout.entities.Absence;
import com.michaelsalgadopeasyinout.easyinout.entities.AbsenceType;
import com.michaelsalgadopeasyinout.easyinout.entities.Employee;
import com.michaelsalgadopeasyinout.easyinout.exceptions.NotFoundException;

public class AbsenceMapper {
    // Mapeo de Ausencia al Get de ausencias para devolver los datos que queremos.
    public static GetAbsenceDTO toDTO(Absence absence){
        if (absence == null) {
            return null;
        }
        var employee = EmployeeMapper.toShortEmployeeDTO(absence.getEmployee());
        if (employee == null) {
            throw new NotFoundException("Empleado no encontrado");
        }
        var absenceType = AbsenceTypeMapper.toDTO(absence.getAbsenceType());
        if (absenceType == null) {
            throw new NotFoundException("Tipo de ausencia no encontrado");
        }
        return GetAbsenceDTO.builder()
            .id(absence.getId())
            .employee(employee)
            .absenceType(absenceType)
            .startDatetime(absence.getStartDatetime())
            .endDatetime(absence.getEndDatetime())
            .reason(absence.getReason())
            .status(absence.getStatus())
            .createdAt(absence.getCreatedAt())
            .updatedAt(absence.getUpdatedAt())
            .build();
    }
    // Mapeo de Ausencia a su DTO preparado para crear
    public static Absence toEntity(CreateAbsenceDTO absence, Employee employee, AbsenceType absenceType){
        if (absence == null) {
            return null;
        }
        return Absence.builder()
            .employee(employee)
            .absenceType(absenceType)
            .startDatetime(absence.getStartDatetime())
            .endDatetime(absence.getEndDatetime())
            .reason(absence.getReason())
            .build();
    }
    // Mapeo de Ausencia a su DTO preparado para modificar
    public static Absence toEntity(UpdateAbsenceDTO absence, Employee employee, AbsenceType absenceType){
        if (absence == null) {
            return null;
        }
        return Absence.builder()
            .id(absence.getId())
            .employee(employee)
            .absenceType(absenceType)
            .startDatetime(absence.getStartDatetime())
            .endDatetime(absence.getEndDatetime())
            .reason(absence.getReason())
            .build();
    }
}
