package com.example.demo.service;

import com.example.demo.entity.ShipmentRecord;
import java.util.List;
import java.util.Optional;

public interface ShipmentRecordService {

    ShipmentRecord createShipment(ShipmentRecord shipment);

    Optional<ShipmentRecord> getShipmentById(Long id);

    List<ShipmentRecord> getAllShipments();

    // ✅ ADD THESE
    ShipmentRecord updateStatus(Long id, String status);

    ShipmentRecord getByShipmentCode(String shipmentCode);
}
