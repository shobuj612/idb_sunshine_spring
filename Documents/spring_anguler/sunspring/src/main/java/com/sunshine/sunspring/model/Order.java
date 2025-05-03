package com.sunshine.sunspring.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "orders") // 'order' is a reserved word in SQL
public class Order {

    @Id
    @Column(name = "order_id")
    private String orderId;

    @Column(name = "buyer_id", nullable = false)
    private String buyerId;

    @Column(name = "style_no")
    private String styleNo;

    @Column(name = "order_qty")
    private int orderQty;

    @Column(name = "order_date")
    @Temporal(TemporalType.DATE)
    private Date orderDate;

    @Column(name = "delivery_date")
    @Temporal(TemporalType.DATE)
    private Date deliveryDate;

    @Column(name = "status")
    private String status;

    public Order() {}

    // Auto-generate UUID if not set
    @PrePersist
    public void generateId() {
        if (this.orderId == null || this.orderId.isEmpty()) {
            this.orderId = UUID.randomUUID().toString();
        }
    }

    // Getters and Setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getStyleNo() {
        return styleNo;
    }

    public void setStyleNo(String styleNo) {
        this.styleNo = styleNo;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
