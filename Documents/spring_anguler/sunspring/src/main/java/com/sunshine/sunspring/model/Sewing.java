package com.sunshine.sunspring.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "sewing")
public class Sewing {

    @Id
    @Column(name = "sewing_id")
    private String sewingId;

    @Column(name = "order_id", nullable = false)
    private String orderId;

    @Column(name = "sewing_start_date")
    @Temporal(TemporalType.DATE)
    private Date sewingStartDate;

    @Column(name = "sewing_end_date")
    @Temporal(TemporalType.DATE)
    private Date sewingEndDate;

    @Column(name = "sewing_qty")
    private int sewingQty;

    // No-args constructor with auto-generated String ID
    public Sewing() {
        this.sewingId = "SEW-" + UUID.randomUUID().toString();
    }

    // Getters and Setters
    public String getSewingId() {
        return sewingId;
    }

    public void setSewingId(String sewingId) {
        this.sewingId = sewingId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
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
