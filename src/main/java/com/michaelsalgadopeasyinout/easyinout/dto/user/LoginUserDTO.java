package com.michaelsalgadopeasyinout.easyinout.dto.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginUserDTO {
    @NotBlank(message = "Usuario no válido")
    @Size(max = 15, message = "El nombre de usuario debe tener máximo 15 carácteres")
    private String username;
    @NotBlank(message = "Contraseña invalida!")
    @Size(min= 8, max = 100, message = "La contraseña debe tener máximo 100 carácteres")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[\\*\\+\\,\\-\\.\\:\\@\\_\\~]).{8,}$", message = "La contraseña debe contener almenos 1 minúscula, 1 mayúscula y 1 carácter y debe tener una longitud de 8")
    private String password;
}
