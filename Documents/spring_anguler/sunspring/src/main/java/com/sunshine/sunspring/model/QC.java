package com.sunshine.sunspring.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "qc_info")
public class QC {

    @Id
    @Column(name = "qc_id")
    private String qcId;

    @Column(name = "order_id", nullable = false)
    private String orderId;

    @Column(name = "inspection_date")
    @Temporal(TemporalType.DATE)
    private Date inspectionDate;

    @Column(name = "passed_qty")
    private int passedQty;

    @Column(name = "rejected_qty")
    private int rejectedQty;

    @Column(name = "remarks")
    private String remarks;

    // Auto-generate ID before insert
    @PrePersist
    public void generateQcId() {
        if (this.qcId == null || this.qcId.isEmpty()) {
            this.qcId = "QC-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        }
    }

    // Constructors
    public QC() {}

    // Getters and Setters
    public String getQcId() {
        return qcId;
    }

    public void setQcId(String qcId) {
        this.qcId = qcId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(Date inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public int getPassedQty() {
        return passedQty;
    }

    public void setPassedQty(int passedQty) {
        this.passedQty = passedQty;
    }

    public int getRejectedQty() {
        return rejectedQty;
    }

    public void setRejectedQty(int rejectedQty) {
        this.rejectedQty = rejectedQty;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
