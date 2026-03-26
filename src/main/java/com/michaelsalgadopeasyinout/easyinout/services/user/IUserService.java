package com.michaelsalgadopeasyinout.easyinout.services.user;

import java.util.List;

import com.michaelsalgadopeasyinout.easyinout.dtos.user.CreateUserDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.user.GetFullUserDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.user.GetShortUserDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.user.UpdateUserDTO;

public interface IUserService {
    List<GetShortUserDTO> getUsers();
    GetFullUserDTO getUserById(Long id);
    GetShortUserDTO createUser(CreateUserDTO userDTO);
    GetShortUserDTO updateUser(Long id, UpdateUserDTO userDTO);
    void deleteUser(Long id);
}
