package com.example.demo.controller;

import com.example.demo.entity.AlertRecord;
import com.example.demo.service.AlertRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alerts")
public class AlertRecordController {

    @Autowired
    private AlertRecordService alertRecordService;

    // POST /api/alerts - Trigger alert
    @PostMapping
    public ResponseEntity<AlertRecord> triggerAlert(
            @RequestBody AlertRecord alert) {
        return ResponseEntity.ok(alertRecordService.triggerAlert(alert));
    }

    // PUT /api/alerts/{id}/acknowledge - Acknowledge alert
    @PutMapping("/{id}/acknowledge")
    public ResponseEntity<AlertRecord> acknowledgeAlert(
            @PathVariable Long id) {
        return ResponseEntity.ok(alertRecordService.acknowledgeAlert(id));
    }

    // GET /api/alerts/shipment/{shipmentId} - Get alerts for shipment
    @GetMapping("/shipment/{shipmentId}")
    public ResponseEntity<List<AlertRecord>> getByShipment(
            @PathVariable Long shipmentId) {
        return ResponseEntity.ok(
                alertRecordService.getAlertsByShipmentId(shipmentId));
    }

    // GET /api/alerts/{id} - Get alert by ID
    @GetMapping("/{id}")
    public ResponseEntity<AlertRecord> getById(
            @PathVariable Long id) {
        return ResponseEntity.ok(alertRecordService.getById(id));
    }

    // GET /api/alerts - List all alerts
    @GetMapping
    public ResponseEntity<List<AlertRecord>> getAll() {
        return ResponseEntity.ok(alertRecordService.getAllAlerts());
    }
}
