package com.example.demo.service;

import com.example.demo.entity.ShipmentRecord;
import java.util.List;
import java.util.Optional;

public interface ShipmentRecordService {

    ShipmentRecord createShipment(ShipmentRecord shipment);

    Optional<ShipmentRecord> getShipmentById(Long id);

    List<ShipmentRecord> getAllShipments();

    // ✅ REQUIRED BY TEST
    ShipmentRecord updateShipmentStatus(Long id, String status);

    // ✅ REQUIRED BY TEST
    Optional<ShipmentRecord> getShipmentByCode(String shipmentCode);
}
