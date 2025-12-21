package com.example.demo.service.impl;

import com.example.demo.repository.TemperatureSensorLogRepository;
import com.example.demo.entity.TemperatureSensorLog;
import com.example.demo.service.TemperatureLogService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class TemperatureLogServiceImpl implements TemperatureLogService {

    @Autowired
    private TemperatureSensorLogRepository tsl;

    public TemperatureSensorLog recordLog(TemperatureSensorLog sensor) {
        return tsl.save(sensor);
    }

    public List<TemperatureSensorLog> getLogsByShipment(Long shipmentId) {
        return tsl.findByShipmentId(shipmentId);
    }

    public Optional<TemperatureSensorLog> getLogById(Long id) {
        return tsl.findById(id);
    }

    public List<TemperatureSensorLog> getAllLogs() {
        return tsl.findAll();
    }
}
