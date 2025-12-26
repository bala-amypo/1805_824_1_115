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

    // REQUIRED by test cases
    public ShipmentRecordController() {
    }

    @GetMapping
    public List<ShipmentRecord> getAll() {
        return shipmentService.getAllShipments();
    }

    @GetMapping("/{id}")
    public Optional<ShipmentRecord> getById(@PathVariable Long id) {
        return shipmentService.getShipmentById(id);
    }

    @PostMapping
    public ShipmentRecord create(@RequestBody ShipmentRecord shipment) {
        return shipmentService.createShipment(shipment);
    }

    @PutMapping("/{id}/status")
    public ShipmentRecord updateStatus(
            @PathVariable Long id,
            @RequestParam String status) {
        return shipmentService.updateShipmentStatus(id, status);
    }
}
