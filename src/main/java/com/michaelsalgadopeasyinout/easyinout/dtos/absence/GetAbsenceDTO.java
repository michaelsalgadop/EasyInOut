package com.michaelsalgadopeasyinout.easyinout.dtos.absence;

import java.time.LocalDateTime;

import com.michaelsalgadopeasyinout.easyinout.dtos.absencetype.GetAbsenceTypeDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.employee.GetShortEmployeeDTO;
import com.michaelsalgadopeasyinout.easyinout.entities.AbsenceStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetAbsenceDTO {
    private Long id;
    private GetShortEmployeeDTO employee;
    private GetAbsenceTypeDTO absenceType;
    private LocalDateTime startDatetime;
    private LocalDateTime endDatetime;
    private String reason;
    private AbsenceStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
