package com.example.demo.service;
import com.example.demo.entity.ShipmentRecord;
import jakarta.persistence.Service;


public interface ShipmentRecordService{
    public ShipmentRecord createShipment(ShipmentRecord shipment);

    public ShipmentRecord updateShipmentStatus(Long id,String status);

    public ShipmentRecord getShipmentByCode(String code);

    public ShipmentRecord getShipmentById(Long id);

    public ShipmentRecord getAllShipments();
}