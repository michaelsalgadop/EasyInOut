package com.michaelsalgadopeasyinout.easyinout.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michaelsalgadopeasyinout.easyinout.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
    
}
