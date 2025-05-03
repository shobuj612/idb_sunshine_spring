package com.sunshine.sunspring.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cutting")
public class Cutting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // For Oracle, use SEQUENCE if preferred
    @Column(name = "cutting_id")
    private Long cuttingId;

    @Column(name = "order_id", nullable = false)
    private Long orderId; // Changed from String to Long

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

    // Default constructor
    public Cutting() {}

    // Getters and Setters
    public Long getCuttingId() {
        return cuttingId;
    }

    public void setCuttingId(Long cuttingId) {
        this.cuttingId = cuttingId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
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
