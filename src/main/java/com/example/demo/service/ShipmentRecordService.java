package com.example.demo.service;
package com.example.demo.entity.ShipmentRecord;
import jakarta.persistence.Service;

@Service
public interface ShipmentRecordService{
    public ShipmentRecord createShipment(ShipmentRecord shipment);

    public ShipmentRecord updateShipmentStatus(Long id,String status);

    public ShipmentRecord getShipmentByCode(String code);

    public ShipmentRecord getShipmentById(Long id);

    public ShipmentRecord getAllShipments();
}