package com.michaelsalgadopeasyinout.easyinout.dtos.timerecord;

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
public class UpdateTimeRecordDTO {
    private Long id;
    private Long idEmployee;
    @NotBlank(message = "Estado inválido!")
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private String notes;
}
