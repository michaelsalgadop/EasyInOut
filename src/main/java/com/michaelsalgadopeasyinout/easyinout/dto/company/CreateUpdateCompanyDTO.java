package com.michaelsalgadopeasyinout.easyinout.dto.company;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateUpdateCompanyDTO {
    @NotBlank(message = "Nombre de la compañia no especificado")
    private String name;
}
