package com.example.demo.service;
import com.example.demo.entity.TemperatureSensorLog;
import jakarta.persistence.Service;

public interface TemperatureLogService{
    public TemperatureSensorLog recordLog(TemperatureSensorLog log);
    public TemperatureSensorLog getLogsByShipment(Long shipmentld);
    public TemperatureSensorLog getLogByld(Long id);
    public TemperatureSensoreLog getAllLogs();
}
