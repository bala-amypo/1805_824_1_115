package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BreachRecord;
import com.example.demo.repository.BreachRecordRepository;
import com.example.demo.service.BreachDetectionService;

@Service
public class BreachDetectionServiceImpl implements BreachDetectionService {

    @Autowired
    private BreachRecordRepository breachRepo;

    @Override
    public BreachRecord logBreach(BreachRecord breach) {
        breach.setResolved(false);
        return breachRepo.save(breach);
    }

    @Override
    public List<BreachRecord> getBreachesByShipment(Long shipmentId) {
        return breachRepo.findByShipmentId(shipmentId);
    }

    @Override
    public BreachRecord resolveBreach(Long id) {
        BreachRecord breach = breachRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Breach not found"));

        breach.setResolved(true);
        return breachRepo.save(breach);
    }

    @Override
    public BreachRecord getBreachById(Long id) {
        return breachRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Breach not found"));
    }

    @Override
    public List<BreachRecord> getAllBreaches() {
        return breachRepo.findAll();
    }
}
