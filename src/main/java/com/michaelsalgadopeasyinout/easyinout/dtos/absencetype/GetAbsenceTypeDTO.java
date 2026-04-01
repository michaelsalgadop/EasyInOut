package com.michaelsalgadopeasyinout.easyinout.dtos.absencetype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetAbsenceTypeDTO {
    private Long id;
    private String name;
    private String description;
}
