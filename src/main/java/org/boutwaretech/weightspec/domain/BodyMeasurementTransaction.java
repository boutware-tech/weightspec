package org.boutwaretech.weightspec.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BodyMeasurementTransaction extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private boolean committed;

    @OneToMany(mappedBy = "transaction")
    private List<BodyMeasurement> measurements;
    
    @OneToMany(mappedBy = "transaction")
    private List<BodyMeasurementApproval> approvals;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<BodyMeasurement> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(List<BodyMeasurement> measurements) {
        this.measurements = measurements;
    }

    public List<BodyMeasurementApproval> getApprovals() {
        return approvals;
    }

    public void setApprovals(List<BodyMeasurementApproval> approvals) {
        this.approvals = approvals;
    }
    
    public boolean isCommitted() {
        return committed;
    }

    public void setCommitted(boolean committed) {
        this.committed = committed;
    }
}
