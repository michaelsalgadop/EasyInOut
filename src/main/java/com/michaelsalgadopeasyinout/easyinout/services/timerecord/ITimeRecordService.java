package com.michaelsalgadopeasyinout.easyinout.services.timerecord;

import java.util.List;

import com.michaelsalgadopeasyinout.easyinout.dtos.timerecord.CreateTimeRecordDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.timerecord.GetTimeRecordDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.timerecord.UpdateTimeRecordDTO;

public interface ITimeRecordService {
    List<GetTimeRecordDTO> getTimeRecordsByEmployee(Long id);
    GetTimeRecordDTO getTimeRecordById(Long id);
    GetTimeRecordDTO createTimeRecord(CreateTimeRecordDTO timeRecordDTO);
    GetTimeRecordDTO updateTimeRecord(Long id, UpdateTimeRecordDTO timeRecordDTO);
    void deleteTimeRecord(Long id);
}
