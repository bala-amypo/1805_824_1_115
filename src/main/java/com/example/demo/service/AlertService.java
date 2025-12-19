package com.example.demo.service;
import com.example.demo.entity.AlertRecord;
import jakarta.persistence.Service;

@Service
public interface AlertService{
 public AlertRecord triggerAlert(AlertRecord alert);
 public AlertRecord acknowledgeAlert(Long id);
 public AlertRecord getAlertsByShipment(Long shipment);
 public AlertRecord getAllAlerts();
}