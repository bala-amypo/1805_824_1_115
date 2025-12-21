 package com.example.demo.controller;

import java.util.List;

import com.example.demo.entity.AlertRecord;
import com.example.demo.service.AlertService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class AlertController {

    @Autowired
    private AlertService as;

  
    @PostMapping("/addalert")
    public AlertRecord createAlert(@RequestBody AlertRecord alert) {
        return as.triggerAlert(alert);
    }

    @GetMapping("/getallalerts")
    public List<AlertRecord> getAllAlerts() {
        return as.getAllAlerts();
    }

    
    @GetMapping("/alerts/{shipmentId}")
    public List<AlertRecord> getAlertsByShipment(@PathVariable Long shipmentId) {
        return as.getAlertsByShipment(shipmentId);
    }
}
