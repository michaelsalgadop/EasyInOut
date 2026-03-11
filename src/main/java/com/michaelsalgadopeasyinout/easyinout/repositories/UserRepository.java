package com.michaelsalgadopeasyinout.easyinout.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michaelsalgadopeasyinout.easyinout.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
