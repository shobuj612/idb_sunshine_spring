package com.sunshine.sunspring.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "merchandising_info")
public class MerchandisingInfo {

    @Id
    @Column(name = "merch_id")
    private String merchId;

    @Column(name = "order_id", nullable = false)
    private String orderId;

    @Column(name = "merchandiser_name")
    private String merchandiserName;

    @Column(name = "sampling_done")
    private String samplingDone;

    @Column(name = "approval_date")
    @Temporal(TemporalType.DATE)
    private Date approvalDate;

    @Column(name = "remarks")
    private String remarks;

    public MerchandisingInfo() {}

    // Auto-generate String ID before saving
    @PrePersist
    public void generateId() {
        if (this.merchId == null || this.merchId.isEmpty()) {
            this.merchId = UUID.randomUUID().toString();
        }
    }

    // Getters and Setters
    public String getMerchId() {
        return merchId;
    }

    public void setMerchId(String merchId) {
        this.merchId = merchId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getMerchandiserName() {
        return merchandiserName;
    }

    public void setMerchandiserName(String merchandiserName) {
        this.merchandiserName = merchandiserName;
    }

    public String getSamplingDone() {
        return samplingDone;
    }

    public void setSamplingDone(String samplingDone) {
        this.samplingDone = samplingDone;
    }

    public Date getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(Date approvalDate) {
        this.approvalDate = approvalDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
