package com.michaelsalgadopeasyinout.easyinout.mappers;

import com.michaelsalgadopeasyinout.easyinout.dtos.timerecord.CreateTimeRecordDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.timerecord.GetTimeRecordDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.timerecord.UpdateTimeRecordDTO;
import com.michaelsalgadopeasyinout.easyinout.entities.Employee;
import com.michaelsalgadopeasyinout.easyinout.entities.TimeRecord;
import com.michaelsalgadopeasyinout.easyinout.exceptions.NotFoundException;

public class TimeRecordMapper {
    // Mapeo de TimeRecord al Get de TimeRecord para devolver los datos que queremos.
    public static GetTimeRecordDTO toDTO(TimeRecord timeRecord){
        if (timeRecord == null) {
            return null;
        }
        var employee = EmployeeMapper.toShortEmployeeDTO(timeRecord.getEmployee());
        if (employee == null) {
            throw new NotFoundException("Empleado no encontrado");
        }
        return GetTimeRecordDTO.builder()
            .id(timeRecord.getId())
            .employee(employee)
            .checkIn(timeRecord.getCheckIn())
            .checkOut(timeRecord.getCheckOut())
            .notes(timeRecord.getNotes())
            .build();
    }
    public static TimeRecord toEntity(CreateTimeRecordDTO timeRecord, Employee employee){
        if (timeRecord == null) {
            return null;
        }
        return TimeRecord.builder()
            .employee(employee)
            .checkIn(timeRecord.getCheckIn())
            .checkOut(timeRecord.getCheckOut())
            .notes(timeRecord.getNotes())
            .build();
    }
    public static TimeRecord toEntity(UpdateTimeRecordDTO timeRecord, Employee employee){
        if (timeRecord == null) {
            return null;
        }
        return TimeRecord.builder()
            .id(timeRecord.getId())
            .employee(employee)
            .checkIn(timeRecord.getCheckIn())
            .checkOut(timeRecord.getCheckOut())
            .notes(timeRecord.getNotes())
            .build();
    }
}
