package com.sunshine.sunspring.model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "design_info") // Change this to match your table name in DB
public class DesignInfo {

    @Id
    @Column(name = "design_id")
    private String designId;

    @Column(name = "order_id", nullable = false)
    private String orderId;

    @Column(name = "design_name", nullable = false)
    private String designName;

    @Column(name = "design_image_url")
    private String designImageUrl;

    @Column(name = "status")
    private String status;

    @Column(name = "remarks")
    private String remarks;

    // No-args constructor
    public DesignInfo() {}

    // Auto-generate UUID for designId if not set
    @PrePersist
    public void generateId() {
        if (this.designId == null || this.designId.isEmpty()) {
            this.designId = UUID.randomUUID().toString();
        }
    }

    // Getters and Setters
    public String getDesignId() {
        return designId;
    }

    public void setDesignId(String designId) {
        this.designId = designId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDesignName() {
        return designName;
    }

    public void setDesignName(String designName) {
        this.designName = designName;
    }

    public String getDesignImageUrl() {
        return designImageUrl;
    }

    public void setDesignImageUrl(String designImageUrl) {
        this.designImageUrl = designImageUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
