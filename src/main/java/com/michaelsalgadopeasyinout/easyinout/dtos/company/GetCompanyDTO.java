package com.michaelsalgadopeasyinout.easyinout.dtos.company;

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
public class GetCompanyDTO {
    private Long id;
    private String name;
}
