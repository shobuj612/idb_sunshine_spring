package com.sunshine.sunspring.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "fabric_info") // Change this to match your table name in DB
public class FabricInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generated ID using the database
    @Column(name = "fabric_id")
    private Long fabricId; // Changed from String to Long

    @Column(name = "order_id", nullable = false)
    private Long orderId; // Changed from String to Long

    @Column(name = "fabric_type", nullable = false)
    private String fabricType;

    @Column(name = "fabric_qty")
    private int fabricQty;

    @Column(name = "received_date")
    @Temporal(TemporalType.DATE)
    private Date receivedDate;

    @Column(name = "available_stock")
    private int availableStock;

    // Default constructor
    public FabricInfo() {}

    // Getters and Setters
    public Long getFabricId() {
        return fabricId;
    }

    public void setFabricId(Long fabricId) {
        this.fabricId = fabricId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
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
