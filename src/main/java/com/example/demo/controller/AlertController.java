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
    private AlertService alertService;

    
    @PostMapping("/addalert")
    public AlertRecord create(@RequestBody AlertRecord alert) {
        return alertService.triggerAlert(alert);
    }
 
    @GetMapping("/getallalerts")
    public List<AlertRecord> listall() {
        return alertService.getAllAlerts();
    }

     
    @GetMapping("/getalert/{shipmentId}")
    public List<AlertRecord> getAlert(@PathVariable Long shipmentId) {
        return alertService.getAlert(shipmentId);
    }
}
