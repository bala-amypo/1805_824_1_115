package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.TemperatureSensorLog;
import com.example.demo.service.TemperatureLogService;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/temperature")
public class TemperatureLogController {

    @Autowired
    private TemperatureLogService tm;

    @PostMapping("/log")
    public TemperatureSensorLog create(@RequestBody TemperatureSensorLog log) {
        return tm.recordLog(log);
    }

    @GetMapping("/all")
    public List<TemperatureSensorLog> listtemp() {
        return tm.getAllLogs();
    }

    @GetMapping("/getid/{id}")
    public Optional<TemperatureSensorLog> getbyid(@PathVariable Long id) {
        return tm.getLogById(id);
    }

    @GetMapping("/shipment/{shipmentId}")
    public List<TemperatureSensorLog> getshipid(@PathVariable Long shipmentId) {
        return tm.getLogsByShipment(shipmentId);
    }
}
