package com.example.demo.service.impl;
import com.example.demo.repository.BreachDetectionRepository;
import com.example.demo.entity.BreachDetection;
import com.example.demo.service.BreachDectionService;
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