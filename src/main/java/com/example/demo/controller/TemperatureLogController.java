package com.example.demo.controller;

import com.example.demo.entity.TemperatureSensorLog;
import com.example.demo.service.TemperatureLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logs")
public class TemperatureLogController {

    @Autowired
    private TemperatureLogService temperatureLogService;

    // POST /api/logs - Record temperature log
    @PostMapping
    public ResponseEntity<TemperatureSensorLog> createLog(
            @RequestBody TemperatureSensorLog log) {
        return ResponseEntity.ok(temperatureLogService.saveLog(log));
    }

    // GET /api/logs/shipment/{shipmentId} - Get logs for shipment
    @GetMapping("/shipment/{shipmentId}")
    public ResponseEntity<List<TemperatureSensorLog>> getByShipment(
            @PathVariable Long shipmentId) {
        return ResponseEntity.ok(
                temperatureLogService.getLogsByShipmentId(shipmentId));
    }

    // GET /api/logs/{id} - Get log by ID
    @GetMapping("/{id}")
    public ResponseEntity<TemperatureSensorLog> getById(
            @PathVariable Long id) {
        return ResponseEntity.ok(temperatureLogService.getLogById(id));
    }

    // GET /api/logs - List all logs
    @GetMapping
    public ResponseEntity<List<TemperatureSensorLog>> getAll() {
        return ResponseEntity.ok(temperatureLogService.getAllLogs());
    }
}
