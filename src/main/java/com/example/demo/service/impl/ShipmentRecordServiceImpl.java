package com.example.demo.service.impl;

import com.example.demo.entity.ShipmentRecord;
import com.example.demo.repository.ShipmentRecordRepository;
import com.example.demo.service.ShipmentRecordService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShipmentRecordServiceImpl implements ShipmentRecordService {

    private final ShipmentRecordRepository shipmentRecordRepository;

    public ShipmentRecordServiceImpl(ShipmentRecordRepository shipmentRecordRepository) {
        this.shipmentRecordRepository = shipmentRecordRepository;
    }

    @Override
    public ShipmentRecord createShipment(ShipmentRecord shipment) {
        return shipmentRecordRepository.save(shipment);
    }

    @Override
    public Optional<ShipmentRecord> getShipmentById(Long id) {
        return shipmentRecordRepository.findById(id);
    }

    @Override
    public List<ShipmentRecord> getAllShipments() {
        return shipmentRecordRepository.findAll();
    }

    // ✅ REQUIRED BY TEST
    @Override
    public ShipmentRecord updateShipmentStatus(Long id, String status) {
        ShipmentRecord shipment = shipmentRecordRepository
                .findById(id)
                .orElseThrow();

        shipment.setStatus(status);
        return shipmentRecordRepository.save(shipment);
    }

    // ✅ REQUIRED BY TEST
    @Override
    public Optional<ShipmentRecord> getShipmentByCode(String shipmentCode) {
        return shipmentRecordRepository.findByShipmentCode(shipmentCode);
    }
}
