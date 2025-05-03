package com.sunshine.sunspring.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "warehouse")
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate ID using the database
    @Column(name = "warehouse_id")
    private Long warehouseId; // Changed from String to Long

    @Column(name = "order_id", nullable = false)
    private Long orderId; // Changed from String to Long

    @Column(name = "received_date")
    @Temporal(TemporalType.DATE)
    private Date receivedDate;

    @Column(name = "stored_qty")
    private int storedQty;

    // No-args constructor
    public Warehouse() {}

    // Getters and Setters
    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
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
