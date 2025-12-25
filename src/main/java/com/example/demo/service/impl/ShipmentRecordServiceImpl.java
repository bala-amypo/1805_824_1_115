package com.example.demo.service.impl;

import com.example.demo.entity.ShipmentRecord;
import com.example.demo.repository.ShipmentRecordRepository;
import com.example.demo.service.ShipmentRecordService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShipmentRecordServiceImpl implements ShipmentRecordService {

    private final ShipmentRecordRepository repository;

    public ShipmentRecordServiceImpl(ShipmentRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public ShipmentRecord createShipment(ShipmentRecord shipment) {
        return repository.save(shipment);
    }

    @Override
    public List<ShipmentRecord> getAllShipments() {
        return repository.findAll();
    }

    @Override
    public ShipmentRecord updateShipmentStatus(Long id, String status) {
        Optional<ShipmentRecord> shipmentOpt = repository.findById(id);
        if (shipmentOpt.isPresent()) {
            ShipmentRecord shipment = shipmentOpt.get();
            shipment.setStatus(status);
            return repository.save(shipment);
        }
        return null;
    }

    
    @Override
    public Optional<ShipmentRecord> getShipmentById(Long id) {
        return repository.findById(id);
    }
}
