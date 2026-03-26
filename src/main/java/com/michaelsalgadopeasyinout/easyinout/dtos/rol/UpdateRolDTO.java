package com.michaelsalgadopeasyinout.easyinout.dtos.rol;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateRolDTO {
    private Long id;
    @NotBlank(message = "Nombre de rol inválido!")
    private String name;
    private String description;
}
