package com.example.demo.service;

import com.example.demo.entity.TemperatureSensorLog;
import java.util.List;
import java.util.Optional;

public interface TemperatureLogService {
    TemperatureSensorLog recordLog(TemperatureSensorLog log);
    List<TemperatureSensorLog> getAllLogs();
    Optional<TemperatureSensorLog> getLogById(Long id);
    Optional<TemperatureSensorLog> getLogsByShipment(Long shipment);
   
}