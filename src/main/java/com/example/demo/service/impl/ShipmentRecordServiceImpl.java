package com.example.demo.service.impl;

import com.example.demo.repository.*;
import com.example.demo.entity.*;
import com.example.demo.service.*;
import java.util.*;

public class ShipmentRecordServiceImpl implements ShipmentRecordService {

    private final ShipmentRecordRepository repo;

    public ShipmentRecordServiceImpl(ShipmentRecordRepository repo) {
        this.repo = repo;
    }

    public ShipmentRecord createShipment(ShipmentRecord s) {
        return repo.save(s);
    }

    public ShipmentRecord updateShipmentStatus(Long id, String status) {
        ShipmentRecord s = repo.findById(id).orElseThrow();
        s.setStatus(status);
        return repo.save(s);
    }

    public Optional<ShipmentRecord> getShipmentByCode(String code) {
        return repo.findByShipmentCode(code);
    }

    public List<ShipmentRecord> getAllShipments() {
        return repo.findAll();
    }
}
