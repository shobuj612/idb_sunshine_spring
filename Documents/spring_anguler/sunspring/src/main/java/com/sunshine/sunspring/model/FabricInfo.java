package com.sunshine.sunspring.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "fabric_info") // Change this to match your table name in DB
public class FabricInfo {

    @Id
    @Column(name = "fabric_id")
    private String fabricId;

    @Column(name = "order_id", nullable = false)
    private String orderId;

    @Column(name = "fabric_type", nullable = false)
    private String fabricType;

    @Column(name = "fabric_qty")
    private int fabricQty;

    @Column(name = "received_date")
    @Temporal(TemporalType.DATE)
    private Date receivedDate;

    @Column(name = "available_stock")
    private int availableStock;

    // No-args constructor
    public FabricInfo() {}

    // Auto-generate UUID for fabricId if not set
    @PrePersist
    public void generateId() {
        if (this.fabricId == null || this.fabricId.isEmpty()) {
            this.fabricId = UUID.randomUUID().toString();
        }
    }

    // Getters and Setters
    public String getFabricId() {
        return fabricId;
    }

    public void setFabricId(String fabricId) {
        this.fabricId = fabricId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getFabricType() {
        return fabricType;
    }

    public void setFabricType(String fabricType) {
        this.fabricType = fabricType;
    }

    public int getFabricQty() {
        return fabricQty;
    }

    public void setFabricQty(int fabricQty) {
        this.fabricQty = fabricQty;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(int availableStock) {
        this.availableStock = availableStock;
    }
}
