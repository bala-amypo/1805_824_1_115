package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;





@Entity
public class BreachRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long shipmentId; // Added as per your spec
    private Long logId;      // Fixed typo
    private String breachType;
    private Double breachValue; // Fixed typo
    private String severity;
    private String details;
    private LocalDateTime detectedAt;
    private Boolean resolved;

    public BreachRecord(String breachType, Double breachValue, String details, LocalDateTime detectedAt, Long id, Long logId, Boolean resolved, String severity, Long shipmentId) {
        this.breachType = breachType;
        this.breachValue = breachValue;
        this.details = details;
        this.detectedAt = detectedAt;
        this.id = id;
        this.logId = logId;
        this.resolved = resolved;
        this.severity = severity;
        this.shipmentId = shipmentId;
    }

    public BreachRecord() {
    }

    @PrePersist
    public void prePersist() {
        if (resolved == null) {
            resolved = false;
        }
        if (detectedAt == null) {
            detectedAt = LocalDateTime.now();
        }
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getShipmentId() { return shipmentId; }
    public void setShipmentId(Long shipmentId) { this.shipmentId = shipmentId; }

    public Long getLogId() { return logId; }
    public void setLogId(Long logId) { this.logId = logId; }

    public String getBreachType() { return breachType; }
    public void setBreachType(String breachType) { this.breachType = breachType; }

    public Double getBreachValue() { return breachValue; }
    public void setBreachValue(Double breachValue) { this.breachValue = breachValue; }

    public String getSeverity() { return severity; }
    public void setSeverity(String severity) { this.severity = severity; }

    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }

    public LocalDateTime getDetectedAt() { return detectedAt; }
    public void setDetectedAt(LocalDateTime detectedAt) { this.detectedAt = detectedAt; }

    public Boolean getResolved() { return resolved; }
    public void setResolved(Boolean resolved) { this.resolved = resolved; }
    
}