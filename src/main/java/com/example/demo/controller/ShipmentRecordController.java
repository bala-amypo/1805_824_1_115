package com.example.demo.controller;

import com.example.demo.entity.ShipmentRecord;
import com.example.demo.service.ShipmentRecordService;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shipments")
public class ShipmentRecordController {

    private final ShipmentRecordService shipmentRecordService;

    // ✅ REQUIRED constructor
    public ShipmentRecordController(ShipmentRecordService shipmentRecordService) {
        this.shipmentRecordService = shipmentRecordService;
    }

    @PostMapping
    public ShipmentRecord createShipment(@RequestBody ShipmentRecord shipment) {
        return shipmentRecordService.createShipment(shipment);
    }

    @GetMapping("/{id}")
    public Optional<ShipmentRecord> getShipmentById(@PathVariable Long id) {
        return shipmentRecordService.getShipmentById(id);
    }

    @GetMapping
    public List<ShipmentRecord> getAllShipments() {
        return shipmentRecordService.getAllShipments();
    }
}
