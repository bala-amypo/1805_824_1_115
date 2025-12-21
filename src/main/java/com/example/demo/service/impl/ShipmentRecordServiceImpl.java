package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ShipmentRecord;
import com.example.demo.repository.ShipmentRecordRepository;
import com.example.demo.service.ShipmentRecordService;

@Service
public class ShipmentRecordServiceImpl implements ShipmentRecordService {

    @Autowired
    private ShipmentRecordRepository repo;

    @Override
    public ShipmentRecord createShipment(ShipmentRecord shipment) {
        return repo.save(shipment);
    }

    @Override
    public ShipmentRecord updateShipmentStatus(Long id, String status) {
        ShipmentRecord shipment = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Shipment not found with id: " + id));
        shipment.setStatus(status);
        return repo.save(shipment);
    }

    @Override
    public ShipmentRecord getShipmentByCode(String code) {
        return repo.findByShipmentCode(code)
                .orElseThrow(() -> new RuntimeException("Shipment not found with code: " + code));
    }

    @Override
    public ShipmentRecord getShipmentById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Shipment not found with id: " + id));
    }

    @Override
    public List<ShipmentRecord> getAllShipments() {
        return repo.findAll();
    }
}
