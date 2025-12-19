package com.example.demo.service.impl;
import com.example.demo.repository.TemperatureRuleRepository;
import com.example.demo.entity.TemperatureRule;
import com.example.demo.service.TemperatureRuleService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TemperatureRuleServiceImp implements TemperatureRuleService{

    @Autowired
    TemperatureRuleRepository smr;
    public ShipmentRecord createShipmentRecord(ShipmentRecord record){
        return smr.save(profile);
    }
}