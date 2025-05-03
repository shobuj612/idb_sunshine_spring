package com.sunshine.sunspring.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "shipping")
public class Shipping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate ID using the database
    @Column(name = "shipping_id")
    private Long shippingId; // Changed from String to Long

    @Column(name = "order_id", nullable = false)
    private Long orderId; // Changed from String to Long

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

    // No-args constructor
    public Shipping() {}

    // Getters and Setters
    public Long getShippingId() {
        return shippingId;
    }

    public void setShippingId(Long shippingId) {
        this.shippingId = shippingId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
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
