package com.michaelsalgadopeasyinout.easyinout.dtos.employee;

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
public class GetShortEmployeeDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String dni;
    private boolean active;
}
