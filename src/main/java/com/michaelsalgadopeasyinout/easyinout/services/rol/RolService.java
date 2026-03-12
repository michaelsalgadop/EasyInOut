package com.michaelsalgadopeasyinout.easyinout.services.rol;

import java.util.List;

import org.springframework.stereotype.Service;

import com.michaelsalgadopeasyinout.easyinout.dto.rol.CreateUpdateRolDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.rol.GetRolDTO;

@Service
public class RolService implements IRoleService{

    @Override
    public List<GetRolDTO> getRols() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRols'");
    }

    @Override
    public GetRolDTO getRolById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRolById'");
    }

    @Override
    public GetRolDTO createRol(CreateUpdateRolDTO rolDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createRol'");
    }

    @Override
    public GetRolDTO updateRol(Long id, CreateUpdateRolDTO rolDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateRol'");
    }

    @Override
    public void deleteRol(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteRol'");
    }

}
