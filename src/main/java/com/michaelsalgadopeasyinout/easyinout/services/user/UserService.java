package com.michaelsalgadopeasyinout.easyinout.services.user;

import java.util.List;

import org.springframework.stereotype.Service;

import com.michaelsalgadopeasyinout.easyinout.dto.user.CreateUserDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.user.GetFullUserDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.user.GetShortUserDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.user.UpdateUserDTO;

@Service
public class UserService implements IUserService{

    @Override
    public GetShortUserDTO createUser(CreateUserDTO userDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createUser'");
    }

    @Override
    public GetShortUserDTO updateUser(Long id, UpdateUserDTO userDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public void deleteUser(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

    @Override
    public List<GetShortUserDTO> getUsers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUsers'");
    }

    @Override
    public GetFullUserDTO getUserById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserById'");
    }

}
