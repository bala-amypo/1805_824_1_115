package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;



@Entity
public class TemperatureSensorLog{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Long shipmentld;
    private String sensorld;
    @column(nullable=false)
    private LocalDateTime recordedAt;
    private Double temperatureValue;
    @column(nullable=true)
    private String location;


    
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

    public String getRecordedAt() {
        return recordedAt;
    }

    public void setRecordedAt(String recordedAt) {
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