package com.michaelsalgadopeasyinout.easyinout.services.timerecord;

import java.util.List;

import org.springframework.stereotype.Service;

import com.michaelsalgadopeasyinout.easyinout.dto.timerecord.CreateUpdateTimeRecordDTO;
import com.michaelsalgadopeasyinout.easyinout.dto.timerecord.GetTimeRecordDTO;

@Service
public class TimeRecordService implements ITimeRecordService{

    @Override
    public List<GetTimeRecordDTO> getTimeRecordsByEmployee(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTimeRecordsByEmployee'");
    }

    @Override
    public GetTimeRecordDTO getTimeRecordById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTimeRecordById'");
    }

    @Override
    public GetTimeRecordDTO createTimeRecord(CreateUpdateTimeRecordDTO timeRecordDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createTimeRecord'");
    }

    @Override
    public GetTimeRecordDTO updateTimeRecord(Long id, CreateUpdateTimeRecordDTO timeRecordDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateTimeRecord'");
    }

    @Override
    public void deleteTimeRecord(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteTimeRecord'");
    }

}
