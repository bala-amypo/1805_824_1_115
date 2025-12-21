package com.example.demo.service;

import com.example.demo.entity.ShipmentRecord;
import java.util.List;
import java.util.Optional;

public interface ShipmentRecordService {
    ShipmentRecord createShipment(ShipmentRecord shipment);
    ShipmentRecord updateShipmentStatus(Long id, String status);
    ShipmentRecord getShipmentByCode(String code);
    ShipmentRecord getShipmentById(Long id);
    List<ShipmentRecord> getAllShipments();
}