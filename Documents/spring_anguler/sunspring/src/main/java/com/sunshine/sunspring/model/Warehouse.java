package com.sunshine.sunspring.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "warehouse")
public class Warehouse {

    @Id
    @Column(name = "warehouse_id")
    private String warehouseId;

    @Column(name = "order_id", nullable = false)
    private String orderId;

    @Column(name = "received_date")
    @Temporal(TemporalType.DATE)
    private Date receivedDate;

    @Column(name = "stored_qty")
    private int storedQty;

    // Auto-generate ID before inserting
    @PrePersist
    public void generateWarehouseId() {
        if (this.warehouseId == null || this.warehouseId.isEmpty()) {
            this.warehouseId = "WH-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        }
    }

    // No-args constructor
    public Warehouse() {}

    // Getters and Setters
    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public int getStoredQty() {
        return storedQty;
    }

    public void setStoredQty(int storedQty) {
        this.storedQty = storedQty;
    }
}
