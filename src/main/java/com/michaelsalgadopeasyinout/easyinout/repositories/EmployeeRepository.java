package com.michaelsalgadopeasyinout.easyinout.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michaelsalgadopeasyinout.easyinout.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
