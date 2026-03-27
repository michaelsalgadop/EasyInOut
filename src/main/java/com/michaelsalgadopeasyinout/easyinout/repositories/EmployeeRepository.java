package com.michaelsalgadopeasyinout.easyinout.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michaelsalgadopeasyinout.easyinout.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    List<Employee> findByIdCompany(Long idCompany);
}
