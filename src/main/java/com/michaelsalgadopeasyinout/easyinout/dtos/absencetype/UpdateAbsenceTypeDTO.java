package com.michaelsalgadopeasyinout.easyinout.dtos.absencetype;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateAbsenceTypeDTO {
    private Long id;
    @NotBlank(message = "Nombre invalido!")
    private String name;
    private String description;
    private boolean requiresApproval;
}
