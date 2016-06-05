package org.boutwaretech.weightspec.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BodyMeasurementApproval extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    private BodyMeasurement bodyMeasurement;

    private Boolean approved = false;

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

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }
}
