package com.michaelsalgadopeasyinout.easyinout.dto.timerecord;

import java.time.LocalDateTime;

import com.michaelsalgadopeasyinout.easyinout.dto.employee.GetShortEmployeeDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetTimeRecordDTO {
    private Long id;
    private GetShortEmployeeDTO employee;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private String notes;
}
