package org.boutwaretech.weightspec.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class BodyMeasurementTransaction extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private boolean committed;

    @OneToMany(mappedBy = "transaction")
    private List<BodyMeasurement> measurements;
    
    @OneToMany(mappedBy = "transaction")
    private List<BodyMeasurementApproval> approvals;

}
