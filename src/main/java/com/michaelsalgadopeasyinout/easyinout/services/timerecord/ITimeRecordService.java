package com.michaelsalgadopeasyinout.easyinout.services.timerecord;

import java.util.List;

import com.michaelsalgadopeasyinout.easyinout.dto.timerecord.CreateUpdateTimeRecordDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.timerecord.GetTimeRecordDTO;

public interface ITimeRecordService {
    List<GetTimeRecordDTO> getTimeRecordsByEmployee(Long id);
    GetTimeRecordDTO getTimeRecordById(Long id);
    GetTimeRecordDTO createTimeRecord(CreateUpdateTimeRecordDTO timeRecordDTO);
    GetTimeRecordDTO updateTimeRecord(Long id, CreateUpdateTimeRecordDTO timeRecordDTO);
    void deleteTimeRecord(Long id);
}
