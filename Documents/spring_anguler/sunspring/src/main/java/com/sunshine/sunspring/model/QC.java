package com.sunshine.sunspring.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "qc_info")
public class QC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate ID using the database
    @Column(name = "qc_id")
    private Long qcId; // Changed from String to Long

    @Column(name = "order_id", nullable = false)
    private Long orderId; // Changed from String to Long

    @Column(name = "inspection_date")
    @Temporal(TemporalType.DATE)
    private Date inspectionDate;

    @Column(name = "passed_qty")
    private int passedQty;

    @Column(name = "rejected_qty")
    private int rejectedQty;

    @Column(name = "remarks")
    private String remarks;

    // Constructors
    public QC() {}

    // Getters and Setters
    public Long getQcId() {
        return qcId;
    }

    public void setQcId(Long qcId) {
        this.qcId = qcId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
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
