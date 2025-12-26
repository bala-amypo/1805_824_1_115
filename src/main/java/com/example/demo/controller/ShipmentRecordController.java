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

    // GET all shipments
    @GetMapping
    public List<ShipmentRecord> getAllShipments() {
        return shipmentService.getAllShipments();
    }

    // GET shipment by ID
    @GetMapping("/{id}")
    public Optional<ShipmentRecord> getShipmentById(@PathVariable Long id) {
        return shipmentService.getShipmentById(id);
    }

    // GET shipment by shipment code
    @GetMapping("/code/{shipmentCode}")
    public ShipmentRecord getShipmentByCode(@PathVariable String shipmentCode) {
        return shipmentService.getShipmentByCode(shipmentCode);
    }

    // CREATE shipment
    @PostMapping
    public ShipmentRecord createShipment(@RequestBody ShipmentRecord shipment) {
        return shipmentService.createShipment(shipment);
    }

    // UPDATE shipment status
    @PutMapping("/{id}/status")
    public ShipmentRecord updateShipmentStatus(
            @PathVariable Long id,
            @RequestParam String status) {

        return shipmentService.updateShipmentStatus(id, status);
    }
}
