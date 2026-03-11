package com.michaelsalgadopeasyinout.easyinout.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michaelsalgadopeasyinout.easyinout.entities.TimeRecord;

public interface TimeRecordRepository extends JpaRepository<TimeRecord, Long>{
    
}
