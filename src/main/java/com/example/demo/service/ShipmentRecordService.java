package com.example.demo.service;

import com.example.demo.entity.ShipmentRecord;

import java.util.List;
import java.util.Optional;

public interface ShipmentRecordService {

    ShipmentRecord createShipment(ShipmentRecord shipment);

    List<ShipmentRecord> getAllShipments();

    ShipmentRecord updateShipmentStatus(Long id, String status);

    
    Optional<ShipmentRecord> getShipmentById(Long id);
}
