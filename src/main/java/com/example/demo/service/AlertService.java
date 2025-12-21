package com.example.demo.service;

import com.example.demo.entity.AlertRecord;
import java.util.List;
import

public interface AlertService {
    AlertRecord triggerAlert(AlertRecord alert);
    List<AlertRecord> getAlertsByShipment(Long shipmentId);
    List<AlertRecord> getAllAlerts();
}