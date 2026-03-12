package com.michaelsalgadopeasyinout.easyinout.services.user;

import java.util.List;

import com.michaelsalgadopeasyinout.easyinout.dto.user.CreateUserDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.user.GetFullUserDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.user.GetShortUserDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.user.UpdateUserDTO;

public interface IUserService {
    List<GetShortUserDTO> getUsers();
    GetFullUserDTO getUserById(Long id);
    GetShortUserDTO createUser(CreateUserDTO userDTO);
    GetShortUserDTO updateUser(Long id, UpdateUserDTO userDTO);
    void deleteUser(Long id);
}
