package com.example.demo.controller;

import com.example.demo.entity.BreachRecord;
import com.example.demo.service.BreachRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/breaches")
public class BreachRecordController {

    @Autowired
    private BreachRecordService breachRecordService;

    // POST /api/breaches - Log manual breach
    @PostMapping
    public ResponseEntity<BreachRecord> logBreach(
            @RequestBody BreachRecord breach) {
        return ResponseEntity.ok(breachRecordService.logBreach(breach));
    }

    // PUT /api/breaches/{id}/resolve - Resolve a breach
    @PutMapping("/{id}/resolve")
    public ResponseEntity<BreachRecord> resolveBreach(
            @PathVariable Long id) {
        return ResponseEntity.ok(breachRecordService.resolveBreach(id));
    }

    // GET /api/breaches/shipment/{shipmentId} - Get breaches by shipment
    @GetMapping("/shipment/{shipmentId}")
    public ResponseEntity<List<BreachRecord>> getByShipment(
            @PathVariable Long shipmentId) {
        return ResponseEntity.ok(
                breachRecordService.getBreachesByShipmentId(shipmentId));
    }

    // GET /api/breaches/{id} - Get breach by ID
    @GetMapping("/{id}")
    public ResponseEntity<BreachRecord> getById(
            @PathVariable Long id) {
        return ResponseEntity.ok(breachRecordService.getById(id));
    }

    // GET /api/breaches - List all breaches
    @GetMapping
    public ResponseEntity<List<BreachRecord>> getAll() {
        return ResponseEntity.ok(breachRecordService.getAllBreaches());
    }
}
