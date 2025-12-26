package com.example.demo.service.impl;

import com.example.demo.entity.ShipmentRecord;
import com.example.demo.repository.ShipmentRecordRepository;
import com.example.demo.service.ShipmentRecordService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShipmentRecordServiceImpl implements ShipmentRecordService {

    @Autowired
    private ShipmentRecordRepository repository;

    // ✅ REQUIRED by tests
    public ShipmentRecordServiceImpl() {}

    @Override
    public List<ShipmentRecord> getAllShipments() {
        return repository.findAll();
    }

    @Override
    public Optional<ShipmentRecord> getShipmentById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Optional<ShipmentRecord> getShipmentByCode(String shipmentCode) {
        return repository.findByShipmentCode(shipmentCode);
    }

    @Override
    public ShipmentRecord createShipment(ShipmentRecord shipment) {
        return repository.save(shipment);
    }

    @Override
    public ShipmentRecord updateShipmentStatus(Long id, String status) {
        ShipmentRecord record = repository.findById(id).orElseThrow();
        record.setStatus(status);
        return repository.save(record);
    }
}
