package com.example.demo.service.impl;
import com.example.demo.repository.Repository;
import com.example.demo.entity.ShipmentRecord;
import com.example.demo.service.ShipmentRecordService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ShipmentRecordServiceImp implements ShipmentRecordService{

    @Autowired
    ShipmentRecordRepository smr;
    public ShipmentRecord createShipmentRecord(ShipmentRecord record){
        return smr.save(profile);
    }
}