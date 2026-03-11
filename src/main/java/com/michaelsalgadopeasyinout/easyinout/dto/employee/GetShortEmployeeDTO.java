package com.michaelsalgadopeasyinout.easyinout.dto.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetShortEmployeeDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
