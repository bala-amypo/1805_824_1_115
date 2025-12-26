package com.example.demo.controller;

import com.example.demo.entity.ShipmentRecord;
import com.example.demo.service.ShipmentRecordService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/shipments")
public class ShipmentRecordController {

    @Autowired
    private ShipmentRecordService shipmentService;

    // ✅ REQUIRED by tests
    public ShipmentRecordController() {}

    @GetMapping
    public List<ShipmentRecord> getAllShipments() {
        return shipmentService.getAllShipments();
    }

    @GetMapping("/{id}")
    public Optional<ShipmentRecord> getShipmentById(@PathVariable Long id) {
        return shipmentService.getShipmentById(id);
    }

    @GetMapping("/code/{code}")
    public Optional<ShipmentRecord> getShipmentByCode(@PathVariable String code) {
        return shipmentService.getShipmentByCode(code);
    }

    @PostMapping
    public ShipmentRecord createShipment(@RequestBody ShipmentRecord shipment) {
        return shipmentService.createShipment(shipment);
    }

    @PutMapping("/{id}/status")
    public ShipmentRecord updateStatus(
            @PathVariable Long id,
            @RequestParam String status) {
        return shipmentService.updateShipmentStatus(id, status);
    }
}
