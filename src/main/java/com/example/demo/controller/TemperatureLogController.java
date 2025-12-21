package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.TemperatureSensorLog;
import com.example.demo.service.TemperatureLogService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class TemperatureLogController {
    @Autowired
     TemperatureLogService tm;
    @PostMapping("/log")
    public TemperatureSensorLog create(@RequestBody TemperatureSensorLog log) {
        return tm.recordLog(log);
    }
    @GetMapping("/addtemp")
    public List<TemperatureSensorLog> listtemp() {
        return tm.getAllLogs();
    }
    @GetMapping("/getid/{id}")
    public Optional<TemperatureSensorLog> getbyid(@PathVariable Long id) {
        return tm.getLogById(id);
    }

    @GetMapping("/getshipmentid/{shipmentId}")
    public List<TemperatureSensorLog> getshipid(@PathVariable Long shipmentId) {
        return tm.getLogsByShipment(shipmentId);
    }
}
