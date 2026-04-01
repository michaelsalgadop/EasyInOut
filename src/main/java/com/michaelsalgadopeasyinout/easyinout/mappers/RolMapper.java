package com.michaelsalgadopeasyinout.easyinout.mappers;

import com.michaelsalgadopeasyinout.easyinout.dtos.rol.CreateRolDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.rol.GetRolDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.rol.UpdateRolDTO;
import com.michaelsalgadopeasyinout.easyinout.entities.Rol;

public class RolMapper {
    // Mapeo de Roles al Get de roles para devolver los datos que queremos.
    public static GetRolDTO toDTO(Rol rol){
        if (rol == null) {
            return null;
        }
        return GetRolDTO.builder()
            .id(rol.getId())
            .name(rol.getName())
            .description(rol.getDescription())
            .build();
    }
    // Mapeo de tipo de Rol a su DTO preparado para crear
    public static Rol toEntity(CreateRolDTO rol){
        if (rol == null) {
            return null;
        }
        return Rol.builder()
            .name(rol.getName())
            .description(rol.getDescription())
            .build();
    }
    // Mapeo de Rol a su DTO preparado para modificar
    public static Rol toEntity(UpdateRolDTO rol){
        if (rol == null) {
            return null;
        }
        return Rol.builder()
            .id(rol.getId())
            .name(rol.getName())
            .description(rol.getDescription())
            .build();
    }
}
