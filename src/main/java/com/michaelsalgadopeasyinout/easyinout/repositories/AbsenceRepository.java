package com.michaelsalgadopeasyinout.easyinout.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michaelsalgadopeasyinout.easyinout.entities.Absence;

public interface AbsenceRepository extends JpaRepository<Absence, Long>{
    
}
