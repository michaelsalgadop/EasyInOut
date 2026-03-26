package com.michaelsalgadopeasyinout.easyinout.dtos.company;

import jakarta.validation.constraints.NotBlank;
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
public class CreateCompanyDTO {
    @NotBlank(message = "Nombre de la compañia no especificado")
    private String name;
}
