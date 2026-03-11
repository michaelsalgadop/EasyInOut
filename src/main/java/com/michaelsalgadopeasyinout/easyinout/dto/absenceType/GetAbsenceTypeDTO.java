package com.michaelsalgadopeasyinout.easyinout.dto.absenceType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetAbsenceTypeDTO {
    private Long id;
    private String name;
    private String description;
}
