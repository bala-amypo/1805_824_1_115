package com.example.demo.controller;

import com.example.demo.entity.ShipmentRecord;
import com.example.demo.service.ShipmentRecordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shipments")
public class ShipmentRecordController {

    private final ShipmentRecordService shipmentRecordService;

    // ✅ REQUIRED by test
    public ShipmentRecordController(ShipmentRecordService shipmentRecordService) {
        this.shipmentRecordService = shipmentRecordService;
    }

    @PostMapping
    public ShipmentRecord create(@RequestBody ShipmentRecord shipment) {
        return shipmentRecordService.createShipment(shipment);
    }

    @GetMapping("/{id}")
    public Optional<ShipmentRecord> getById(@PathVariable Long id) {
        return shipmentRecordService.getShipmentById(id);
    }

    @GetMapping
    public List<ShipmentRecord> getAll() {
        return shipmentRecordService.getAllShipments();
    }
}
