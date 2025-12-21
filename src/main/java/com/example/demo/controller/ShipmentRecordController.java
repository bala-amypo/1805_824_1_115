package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.ShipmentRecord;
import com.example.demo.service.ShipmentRecordService;

@RestController
@RequestMapping("/api/shipments")
public class ShipmentRecordController {

    @Autowired
    private ShipmentRecordService service;

    // POST /api/shipments
    @PostMapping
    public ShipmentRecord createShipment(@RequestBody ShipmentRecord shipment) {
        return service.createShipment(shipment);
    }

    // PUT /api/shipments/{id}/status?status=DELIVERED
    @PutMapping("/{id}/status")
    public ShipmentRecord updateStatus(@PathVariable Long id,
                                       @RequestParam String status) {
        return service.updateShipmentStatus(id, status);
    }

    // GET /api/shipments/code/{shipmentCode}
    @GetMapping("/code/{shipmentCode}")
    public ShipmentRecord getByCode(@PathVariable String shipmentCode) {
        return service.getShipmentByCode(shipmentCode);
    }

    // GET /api/shipments/{id}
    @GetMapping("/{id}")
    public ShipmentRecord getById(@PathVariable Long id) {
        return service.getShipmentById(id);
    }

    // GET /api/shipments
    @GetMapping
    public List<ShipmentRecord> getAll() {
        return service.getAllShipments();
    }
}
