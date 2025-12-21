package com.example.demo.service;

import com.example.demo.entity.AlertRecord;
import java.util.List;


public interface AlertService {
    AlertRecord triggerAlert(AlertRecord alert);
    AlterRecord acknowledgeAlert(Long shipment);
    List<AlertRecord> getAlert(Long shipmentId);
    List<AlertRecord> getAllAlerts();
}