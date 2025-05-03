package com.sunshine.sunspring.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sewing")
public class Sewing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate ID using the database
    @Column(name = "sewing_id")
    private Long sewingId; // Changed from String to Long

    @Column(name = "order_id", nullable = false)
    private Long orderId; // Changed from String to Long

    @Column(name = "sewing_start_date")
    @Temporal(TemporalType.DATE)
    private Date sewingStartDate;

    @Column(name = "sewing_end_date")
    @Temporal(TemporalType.DATE)
    private Date sewingEndDate;

    @Column(name = "sewing_qty")
    private int sewingQty;

    // No-args constructor
    public Sewing() {}

    // Getters and Setters
    public Long getSewingId() {
        return sewingId;
    }

    public void setSewingId(Long sewingId) {
        this.sewingId = sewingId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Date getSewingStartDate() {
        return sewingStartDate;
    }

    public void setSewingStartDate(Date sewingStartDate) {
        this.sewingStartDate = sewingStartDate;
    }

    public Date getSewingEndDate() {
        return sewingEndDate;
    }

    public void setSewingEndDate(Date sewingEndDate) {
        this.sewingEndDate = sewingEndDate;
    }

    public int getSewingQty() {
        return sewingQty;
    }

    public void setSewingQty(int sewingQty) {
        this.sewingQty = sewingQty;
    }
}
