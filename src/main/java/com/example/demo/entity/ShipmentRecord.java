package com.example.demo.entity;

public class ShipmentRecord{
    private Long id;
    private Long shipmentld;
    private String sensorld;
    private LocalDateTime recordedAt;
    private Double temperatureValue;
    private Stirng location;


    
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

    public Stirng getLocation() {
        return location;
    }

    public void setLocation(Stirng location) {
        this.location = location;
    }





}