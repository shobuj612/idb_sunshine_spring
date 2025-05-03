package com.sunshine.sunspring.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "shipping")
public class Shipping {

    @Id
    @Column(name = "shipping_id")
    private String shippingId;

    @Column(name = "order_id", nullable = false)
    private String orderId;

    @Column(name = "shipping_date")
    @Temporal(TemporalType.DATE)
    private Date shippingDate;

    @Column(name = "shipped_qty")
    private int shippedQty;

    @Column(name = "invoice_no")
    private String invoiceNo;

    @Column(name = "destination")
    private String destination;

    @Column(name = "carrier")
    private String carrier;

    // Auto-generate ID before persisting
    @PrePersist
    public void generateShippingId() {
        if (this.shippingId == null || this.shippingId.isEmpty()) {
            this.shippingId = "SHIP-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        }
    }

    // No-args constructor
    public Shipping() {}

    // Getters and Setters
    public String getShippingId() {
        return shippingId;
    }

    public void setShippingId(String shippingId) {
        this.shippingId = shippingId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Date shippingDate) {
        this.shippingDate = shippingDate;
    }

    public int getShippedQty() {
        return shippedQty;
    }

    public void setShippedQty(int shippedQty) {
        this.shippedQty = shippedQty;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
}
