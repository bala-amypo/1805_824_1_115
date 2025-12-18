package com.example.demo.service;
import com.example.demo.entity.TemperatureSensorLog;
import jakarta.persistence.Service;

@Service
public interface TemperatureLogService{
    public TemperatureServiceLog recordLog(TemperatureSensorLog log);
    public TemperatureServiceLog getLogsByShipment(Long shipmentld);
    public TemperatureServiceLog getLogByld(Long id);
    public TemperatureServiceLog getAllLogs();
}
