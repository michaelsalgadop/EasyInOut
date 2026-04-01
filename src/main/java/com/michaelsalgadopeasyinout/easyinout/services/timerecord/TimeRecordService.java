package com.michaelsalgadopeasyinout.easyinout.services.timerecord;

import java.util.List;

import org.springframework.stereotype.Service;

import com.michaelsalgadopeasyinout.easyinout.dtos.timerecord.CreateTimeRecordDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.timerecord.GetTimeRecordDTO;
import com.michaelsalgadopeasyinout.easyinout.dtos.timerecord.UpdateTimeRecordDTO;

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
    public GetTimeRecordDTO createTimeRecord(CreateTimeRecordDTO timeRecordDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createTimeRecord'");
    }

    @Override
    public GetTimeRecordDTO updateTimeRecord(Long id, UpdateTimeRecordDTO timeRecordDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateTimeRecord'");
    }

    @Override
    public void deleteTimeRecord(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteTimeRecord'");
    }

}
