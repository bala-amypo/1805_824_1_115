package com.example.demo.controller;

import com.example.demo.entity.ShipmentRecord;
import com.example.demo.service.ShipmentRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shipments")
public class ShipmentRecordController {

    @Autowired
    private ShipmentRecordService shipmentService;


    @PostMapping
    public ResponseEntity<ShipmentRecord> createShipment(
            @RequestBody ShipmentRecord record) {
        return ResponseEntity.ok(shipmentService.createShipment(record));
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<ShipmentRecord> updateStatus(
            @PathVariable Long id,
            @RequestParam String status) {
        return ResponseEntity.ok(shipmentService.updateStatus(id, status));
    }

    @GetMapping("/code/{shipmentCode}")
    public ResponseEntity<ShipmentRecord> getByCode(
            @PathVariable String shipmentCode) {
        return ResponseEntity.ok(shipmentService.getByCode(shipmentCode));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ShipmentRecord> getById(@PathVariable Long id) {
        return ResponseEntity.ok(shipmentService.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<ShipmentRecord>> getAll() {
        return ResponseEntity.ok(shipmentService.getAllShipments());
    }
}
