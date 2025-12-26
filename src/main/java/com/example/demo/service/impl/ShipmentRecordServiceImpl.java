package com.example.demo.service.impl;

import com.example.demo.entity.ShipmentRecord;
import com.example.demo.repository.ShipmentRecordRepository;
import com.example.demo.service.ShipmentRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipmentRecordServiceImpl implements ShipmentRecordService {

    @Autowired
    private ShipmentRecordRepository repository;

    @Override
    public ShipmentRecord saveShipment(ShipmentRecord shipment) {
        return repository.save(shipment);
    }

    @Override
    public ShipmentRecord getShipmentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    
    @Override
    public ShipmentRecord getShipmentByCode(String shipmentCode) {
        return repository.findByShipmentCode(shipmentCode);
    }
}
