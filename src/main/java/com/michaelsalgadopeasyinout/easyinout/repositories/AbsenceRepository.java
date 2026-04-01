package com.michaelsalgadopeasyinout.easyinout.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michaelsalgadopeasyinout.easyinout.entities.Absence;

public interface AbsenceRepository extends JpaRepository<Absence, Long>{
    List<Absence> findByIdEmployee(Long idEmployee);
}
