package com.michaelsalgadopeasyinout.easyinout.dto.timerecord;

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
public class CreateUpdateTimeRecordDTO {
    private Long idEmployee;
    @NotBlank(message = "Estado inválido!")
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private String notes;
}
