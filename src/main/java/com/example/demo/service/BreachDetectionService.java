package com.example.demo.service;
import com.example.demo.entity.BreachRecord;
import jakarta.persistence.Service;

@Service
public interface BreachDetection{
    public BreachRecord logBreach(BreachRecord breach)
    public BreachRecord getBreachesByShipment(Long shipmentld)
    public BreachRecord resolveBreach(Long id)
    public BreachRecord getBreachByld(Long id)
    public BreachRecord getAllBreaches()
}