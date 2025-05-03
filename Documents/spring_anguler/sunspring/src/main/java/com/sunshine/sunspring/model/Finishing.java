package com.sunshine.sunspring.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "finishing")
public class Finishing {

    @Id
    @Column(name = "finish_id")
    private String finishId;

    @Column(name = "order_id", nullable = false)
    private String orderId;

    @Column(name = "finishing_date")
    @Temporal(TemporalType.DATE)
    private Date finishingDate;

    @Column(name = "finish_qty")
    private int finishQty;

    @Column(name = "packing_done")
    private String packingDone;

    // No-args constructor
    public Finishing() {}

    // Automatically generate ID before persisting
    @PrePersist
    public void generateFinishId() {
        this.finishId = "FIN-" + UUID.randomUUID().toString();
    }

    // Getters and Setters
    public String getFinishId() {
        return finishId;
    }

    public void setFinishId(String finishId) {
        this.finishId = finishId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
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
