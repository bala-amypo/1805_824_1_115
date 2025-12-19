package com.example.demo.service.impl;
import com.example.demo.repository.TemperatureSensorLogRepository;
import com.example.demo.entity.TemperatureSensorLog;
import com.example.demo.service.TemperatureLogService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TemperatureLogServiceImp implements TemperatureLogService{

    @Autowired
    TemperatureSensorLogRepository tsl;
    public TemperatureSensorLog createTemperatureSensorLog(TemperatureSenSorLog sensor){
        return tsl.save(sensor);
    }
}