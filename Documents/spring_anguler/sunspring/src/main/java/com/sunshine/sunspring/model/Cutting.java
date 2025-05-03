package com.sunshine.sunspring.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "cutting")
public class Cutting {

    @Id
    @Column(name = "cutting_id")
    private String cuttingId;

    @Column(name = "order_id", nullable = false)
    private String orderId;

    @Column(name = "cutting_start_date")
    @Temporal(TemporalType.DATE)
    private Date cuttingStartDate;

    @Column(name = "cutting_end_date")
    @Temporal(TemporalType.DATE)
    private Date cuttingEndDate;

    @Column(name = "cut_qty")
    private int cutQty;

    @Column(name = "supervisor_name")
    private String supervisorName;

    // Constructor
    public Cutting() {
        this.cuttingId = "CUT-" + UUID.randomUUID().toString(); // Auto-generate string ID
    }

    // Getters and Setters
    public String getCuttingId() {
        return cuttingId;
    }

    public void setCuttingId(String cuttingId) {
        this.cuttingId = cuttingId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getCuttingStartDate() {
        return cuttingStartDate;
    }

    public void setCuttingStartDate(Date cuttingStartDate) {
        this.cuttingStartDate = cuttingStartDate;
    }

    public Date getCuttingEndDate() {
        return cuttingEndDate;
    }

    public void setCuttingEndDate(Date cuttingEndDate) {
        this.cuttingEndDate = cuttingEndDate;
    }

    public int getCutQty() {
        return cutQty;
    }

    public void setCutQty(int cutQty) {
        this.cutQty = cutQty;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }
}
