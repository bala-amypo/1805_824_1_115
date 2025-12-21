package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

import jakarta.persistence.Column;

@Entity
public class TemperatureSensorLog{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Long shipmentld;
    private String sensorld;
    @Column(nullable=false)
    private LocalDateTime recordedAt;
    private Double temperatureValue;
    @Column(nullable=true)
    private String location;

    public TemperatureSensorLog(Long id, String location, LocalDateTime recordedAt, String sensorld, Long shipmentld, Double temperatureValue) {
        this.id = id;
        this.location = location;
        this.recordedAt = recordedAt;
        this.sensorld = sensorld;
        this.shipmentld = shipmentld;
        this.temperatureValue = temperatureValue;
    }

    public TemperatureSensorLog() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShipmentld() {
        return shipmentld;
    }

    public void setShipmentld(Long shipmentld) {
        this.shipmentld = shipmentld;
    }

    public String getSensorld() {
        return sensorld;
    }

    public void setSensorld(String sensorld) {
        this.sensorld = sensorld;
    }

    public LocalDateTime getRecordedAt() {
        return recordedAt;
    }

    public void setRecordedAt(LocalDateTime recordedAt) {
        this.recordedAt = recordedAt;
    }

    public Double getTemperatureValue() {
        return temperatureValue;
    }

    public void setTemperatureValue(Double temperatureValue) {
        this.temperatureValue = temperatureValue;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}


