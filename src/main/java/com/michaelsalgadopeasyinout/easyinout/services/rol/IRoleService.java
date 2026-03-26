package com.michaelsalgadopeasyinout.easyinout.services.rol;

import java.util.List;

import com.michaelsalgadopeasyinout.easyinout.dtos.rol.CreateRolDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.rol.GetRolDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.rol.UpdateRolDTO;

public interface IRoleService {
    List<GetRolDTO> getRols();
    GetRolDTO getRolById(Long id);
    GetRolDTO createRol(CreateRolDTO rolDTO);
    GetRolDTO updateRol(Long id, UpdateRolDTO rolDTO);
    void deleteRol(Long id);
}
