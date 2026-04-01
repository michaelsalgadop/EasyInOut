package com.michaelsalgadopeasyinout.easyinout.dtos.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetShortUserDTO {
    private Long id;
    private String username;
    private String email;
}
