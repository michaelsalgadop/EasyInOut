package com.michaelsalgadopeasyinout.easyinout.dto.absencetype;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateAbsenceTypeDTO {
    @NotBlank(message = "Nombre invalido!")
    private String name;
    private String description;
}
