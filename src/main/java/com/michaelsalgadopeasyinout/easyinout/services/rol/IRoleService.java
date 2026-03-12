package com.michaelsalgadopeasyinout.easyinout.services.rol;

import java.util.List;

import com.michaelsalgadopeasyinout.easyinout.dto.rol.CreateUpdateRolDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.rol.GetRolDTO;

public interface IRoleService {
    List<GetRolDTO> getRols();
    GetRolDTO getRolById(Long id);
    GetRolDTO createRol(CreateUpdateRolDTO rolDTO);
    GetRolDTO updateRol(Long id, CreateUpdateRolDTO rolDTO);
    void deleteRol(Long id);
}
