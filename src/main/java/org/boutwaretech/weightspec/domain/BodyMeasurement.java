package org.boutwaretech.weightspec.domain;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

import org.boutwaretech.weightspec.constants.Gender;
import org.boutwaretech.weightspec.constants.HeightUnit;
import org.boutwaretech.weightspec.constants.WeightUnit;

import groovy.transform.EqualsAndHashCode;
import lombok.Data;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class BodyMeasurement extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    private Integer version;

    private ZonedDateTime assessmentDate;
    @Column(nullable = false)
    private Integer athleteId;
    @Column(length = 50)
    private String athleteFirstName;
    @Column(length = 50)
    private String athleteLastName;
    private Integer teamId;
    private Double weight;
    @Enumerated(EnumType.STRING)
    private WeightUnit weightUnit;
    private Double height;
    @Enumerated(EnumType.STRING)
    private HeightUnit heightUnit;
    private Double specificGravity;
    private boolean passedHydration;
    private Double bodyFatPercent;
    @Column(length = 50)
    private String skinfoldAbdominal;
    @Column(length = 50)
    private String skinfoldSubscapula;
    @Column(length = 50)
    private String skinfoldThigh;
    @Column(length = 50)
    private String skinfoldCalf;
    @Column(length = 50)
    private String skinfoldBicep;
    @Column(length = 50)
    private String skinfoldTricep;
    @Column(length = 50)
    private String skinfoldSupraspinale;
    private Integer assessorId;
    private Integer hydrationAssessor;
    @ManyToOne
    private BodyMeasurementTransaction transaction;
    private Integer governingBodyId;
    @Column(length = 100)
    private String comments;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    
}
