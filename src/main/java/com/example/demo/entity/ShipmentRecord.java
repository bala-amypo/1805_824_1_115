package com.example.demo.entity;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ShipmentRecord {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false,unique=true)
    private String shipmentCode;
    private String orgin;
    private String destination;
    private String productType;
    private LocalDateTime startDate;
    private LocalDateTime expertedDelivery;
    private String status;
    private LocalDateTime createdAt;

    public ShipmentRecord(LocalDateTime createdAt, String destination, LocalDateTime expertedDelivery, Long id, String orgin, String productType, String shipmentCode, LocalDateTime startDate, String status) {
        this.createdAt = createdAt;
        this.destination = destination;
        this.expertedDelivery = expertedDelivery;
        this.id = id;
        this.orgin = orgin;
        this.productType = productType;
        this.shipmentCode = shipmentCode;
        this.startDate = startDate;
        this.status = status;
    }

    public ShipmentRecord() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getShipmentCode() {
        return shipmentCode;
    }
    public void setShipmentCode(String shipmentCode) {
        this.shipmentCode = shipmentCode;
    }
    public String getOrgin() {
        return orgin;
    }
    public void setOrgin(String orgin) {
        this.orgin = orgin;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getProductType() {
        return productType;
    }
    public void setProductType(String productType) {
        this.productType = productType;
    }
    public LocalDateTime getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }
    public LocalDateTime getExpertedDelivery() {
        return expertedDelivery;
    }
    public void setExpertedDelivery(LocalDateTime expertedDelivery) {
        this.expertedDelivery = expertedDelivery;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }


    
}

