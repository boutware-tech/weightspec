package org.boutwaretech.weightspec.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.boutwaretech.weightspec.constants.ApprovalStatus;

@Entity
public class BodyMeasurementApproval extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    private BodyMeasurement bodyMeasurement;

    @ManyToOne
    private BodyMeasurementTransaction transaction;

    @Enumerated(EnumType.STRING)
    private ApprovalStatus status = ApprovalStatus.PENDING;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BodyMeasurement getBodyMeasurement() {
        return bodyMeasurement;
    }

    public void setBodyMeasurement(BodyMeasurement bodyMeasurement) {
        this.bodyMeasurement = bodyMeasurement;
    }

    public ApprovalStatus getStatus() {
        return status;
    }

    public void setStatus(ApprovalStatus status) {
        this.status = status;
    }

    public BodyMeasurementTransaction getTransaction() {
        return transaction;
    }

    public void setTransaction(BodyMeasurementTransaction transaction) {
        this.transaction = transaction;
    }
}
