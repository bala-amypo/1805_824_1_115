package com.example.demo.service;

import com.example.demo.entity.ShipmentRecord;
import java.util.List;
import java.util.Optional;

public interface ShipmentRecordService {

    ShipmentRecord createShipment(ShipmentRecord shipment);

    Optional<ShipmentRecord> getShipmentById(Long id);

    List<ShipmentRecord> getAllShipments();

    // REQUIRED by test cases
    ShipmentRecord updateShipmentStatus(Long id, String status);

    ShipmentRecord getShipmentByCode(String shipmentCode);
}
