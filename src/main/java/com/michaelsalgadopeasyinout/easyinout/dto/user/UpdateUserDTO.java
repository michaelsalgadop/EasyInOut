package com.michaelsalgadopeasyinout.easyinout.dto.user;

import java.util.Set;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserDTO {
    @NotBlank(message = "Usuario no válido")
    @Size(max = 15, message = "El nombre de usuario debe tener máximo 15 carácteres")
    private String username;
    @NotBlank(message = "Email invalido!")
    @Email(message = "Email no tiene un formato válido!")
    private String email;
    private Long idEmployee;
    private Set<Long> roleIds;
    private boolean enabled;
}
