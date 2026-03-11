package com.michaelsalgadopeasyinout.easyinout.dto.absence;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateAbsenceDTO {
    @NotBlank(message = "Empleado no válido")
    private Long idEmployee;
    @NotBlank(message = "Tipo de ausencia no válido")
    private Long idAbsenceType;
    @NotBlank(message = "Fecha de inicio no válido")
    private LocalDateTime startDatetime;
    private String reason;
}
