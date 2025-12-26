package com.example.demo.service;

import com.example.demo.entity.ShipmentRecord;

public interface ShipmentRecordService {

    ShipmentRecord saveShipment(ShipmentRecord shipment);

    ShipmentRecord getShipmentById(Long id);

    
    ShipmentRecord getShipmentByCode(String shipmentCode);
}
