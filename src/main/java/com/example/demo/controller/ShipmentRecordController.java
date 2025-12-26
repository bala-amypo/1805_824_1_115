package com.example.demo.controller;

import com.example.demo.entity.ShipmentRecord;
import com.example.demo.service.ShipmentRecordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/shipments")
public class ShipmentRecordController {

    private final ShipmentRecordService shipmentRecordService;

    public ShipmentRecordController(ShipmentRecordService shipmentRecordService) {
        this.shipmentRecordService = shipmentRecordService;
    }

    // POST /api/shipments
    @PostMapping
    public ShipmentRecord createShipment(@RequestBody ShipmentRecord shipment) {
        return shipmentRecordService.createShipment(shipment);
    }

    // PUT /api/shipments/{id}/status
    @PutMapping("/{id}/status")
    public ShipmentRecord updateStatus(
            @PathVariable Long id,
            @RequestParam String status) {
        return shipmentRecordService.updateStatus(id, status);
    }

    // GET /api/shipments/code/{shipmentCode}
    @GetMapping("/code/{shipmentCode}")
    public ShipmentRecord getByShipmentCode(@PathVariable String shipmentCode) {
        return shipmentRecordService.getByShipmentCode(shipmentCode);
    }

    // GET /api/shipments/{id}
    @GetMapping("/{id}")
    public Optional<ShipmentRecord> getShipmentById(@PathVariable Long id) {
        return shipmentRecordService.getShipmentById(id);
    }

    // GET /api/shipments
    @GetMapping
    public List<ShipmentRecord> getAllShipments() {
        return shipmentRecordService.getAllShipments();
    }
}
