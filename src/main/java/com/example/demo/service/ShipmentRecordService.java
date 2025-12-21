package com.example.demo.service;

import com.example.demo.entity.ShipmentRecord;
import java.util.List;
import java.util.Optional;

public interface ShipmentRecordService {
    // Saves and 
    ShipmentRecord createShipment(ShipmentRecord shipment);

    // Updates status, should throw ResourceNotFoundException if missing
    ShipmentRecord updateShipmentStatus(Long id, String status);

    // Matches repository method findByShipmentCode
    Optional<ShipmentRecord> getShipmentByCode(String code);

    // Standard lookup by ID
    Optional<ShipmentRecord> getShipmentById(Long id);

    // Returns a list to satisfy automated tests
    List<ShipmentRecord> getAllShipments();
}