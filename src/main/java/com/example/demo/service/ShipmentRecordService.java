package com.example.demo.service;

import com.example.demo.entity.ShipmentRecord;
import java.util.List;
import java.util.Optional;

public interface ShipmentRecordService {

    List<ShipmentRecord> getAllShipments();

    Optional<ShipmentRecord> getShipmentById(Long id);

    ShipmentRecord getShipmentByCode(String shipmentCode);

    ShipmentRecord createShipment(ShipmentRecord shipment);

    ShipmentRecord updateShipmentStatus(Long id, String status);
}
