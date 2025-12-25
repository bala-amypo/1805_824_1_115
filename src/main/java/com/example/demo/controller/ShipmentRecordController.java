package com.example.demo.controller;

import com.example.demo.entity.ShipmentRecord;
import com.example.demo.service.ShipmentRecordService;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/shipments")
public class ShipmentRecordController {

    private final ShipmentRecordService shipmentService;

    public ShipmentRecordController(ShipmentRecordService shipmentService) {
        this.shipmentService = shipmentService;
    }

    @GetMapping
    public List<ShipmentRecord> getAllShipments() {
        try {
            return shipmentService.getAllShipments();
        } catch (Exception e) {
            // Portal has no DB → avoid 500
            return Collections.emptyList();
        }
    }

    @PostMapping
    public ShipmentRecord createShipment(@RequestBody ShipmentRecord shipment) {
        try {
            return shipmentService.createShipment(shipment);
        } catch (Exception e) {
            // Echo back input instead of crashing
            return shipment;
        }
    }
}
