package com.michaelsalgadopeasyinout.easyinout.dto.employee;

import java.time.LocalDateTime;


import jakarta.validation.constraints.Email;
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
public class UpdateEmployeeDTO {
    @NotBlank(message = "DNI invalido!")
    @Size(min = 9, max = 9, message = "DNI debe tener 9 caracteres")
    @Pattern(regexp = "^[0-9]{8}[A-Za-z]$", message = "Formato de DNI inválido")
    private String dni;
    @NotBlank(message = "Nombre invalido!")
    @Size(min = 2, max = 50, message = "Nombre debe tener entre 2 y 50 caracteres")
    private String firstName;
    @NotBlank(message = "Apellido invalido!")
    private String lastName;
    @NotBlank(message = "Email invalido!")
    @Email(message = "Email no tiene un formato válido!")
    private String email;
    private int phone;
    private LocalDateTime hireDate;
    private boolean active;
    private Long departmentId;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
    private Long userId;
}
