package com.michaelsalgadopeasyinout.easyinout.services.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michaelsalgadopeasyinout.easyinout.dtos.user.CreateUserDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.user.GetFullUserDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.user.GetShortUserDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.user.UpdateUserDTO;
import com.michaelsalgadopeasyinout.easyinout.exceptions.NotFoundException;
import com.michaelsalgadopeasyinout.easyinout.mappers.UserMapper;
import com.michaelsalgadopeasyinout.easyinout.repositories.UserRepository;

@Service
public class UserService implements IUserService{

    @Autowired
    private  UserRepository repository;

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
       return repository.findById(id).map(UserMapper::toFullUserDTO).orElseThrow(() -> new NotFoundException("Usuario no encontrado"));
    }

}
