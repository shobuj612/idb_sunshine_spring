package com.sunshine.sunspring.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "finishing")
public class Finishing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate ID using the database
    @Column(name = "finish_id")
    private Long finishId; // Changed from String to Long

    @Column(name = "order_id", nullable = false)
    private Long orderId; // Changed from String to Long

    @Column(name = "finishing_date")
    @Temporal(TemporalType.DATE)
    private Date finishingDate;

    @Column(name = "finish_qty")
    private int finishQty;

    @Column(name = "packing_done")
    private String packingDone;

    // No-args constructor
    public Finishing() {}

    // Getters and Setters
    public Long getFinishId() {
        return finishId;
    }

    public void setFinishId(Long finishId) {
        this.finishId = finishId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Date getFinishingDate() {
        return finishingDate;
    }

    public void setFinishingDate(Date finishingDate) {
        this.finishingDate = finishingDate;
    }

    public int getFinishQty() {
        return finishQty;
    }

    public void setFinishQty(int finishQty) {
        this.finishQty = finishQty;
    }

    public String getPackingDone() {
        return packingDone;
    }

    public void setPackingDone(String packingDone) {
        this.packingDone = packingDone;
    }
}
