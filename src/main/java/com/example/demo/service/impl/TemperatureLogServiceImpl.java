package com.example.demo.service.impl;
import com.example.demo.repository.TemperatureSensorLogRepository;
import com.example.demo.entity.TemperatureSensorLog;
import com.example.demo.service.TemperatureLogService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class TemperatureLogServiceImpl implements TemperatureLogService{

    @Autowired
    TemperatureSensorLogRepository tsl;
    public TemperatureSensorLog recordLog(TemperatureSenSorLog sensor){
        return tsl.save(sensor);
    }
    public List<TemperatureSensorLog> getAllLogs(Long shipmentld){
        return tsl.findByShipmentId(shipmentId);
    }
    public TemperatureSensorLog getLogById(Long id){
        return tsl.findById(id);
    }
    public List<TemperatureSensorLog> getAllRules(){
        return.tsl.findAll();
    }
}