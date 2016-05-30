package org.boutwaretech.weightspec.domain;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class BodyMeasurement extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    private ZonedDateTime assessmentDate;
    private Integer athleteId;
    private Double weight;
    @Column(length = 10)
    private String weightUnit;
    private Double height;
    @Column(length = 10)
    private String heightUnit;
    private Double specificGravity;
    private Boolean passedHydration;
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
    private Integer transactionId;
    private Integer governingBodyId;
    @Column(length = 100)
    private String comments;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public ZonedDateTime getAssessmentDate() {
        return assessmentDate;
    }

    public void setAssessmentDate(ZonedDateTime assessmentDate) {
        this.assessmentDate = assessmentDate;
    }

    public Integer getAthleteId() {
        return athleteId;
    }

    public void setAthleteId(Integer athleteId) {
        this.athleteId = athleteId;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getHeightUnit() {
        return heightUnit;
    }

    public void setHeightUnit(String heightUnit) {
        this.heightUnit = heightUnit;
    }

    public Double getSpecificGravity() {
        return specificGravity;
    }

    public void setSpecificGravity(Double specificGravity) {
        this.specificGravity = specificGravity;
    }

    public Boolean getPassedHydration() {
        return passedHydration;
    }

    public void setPassedHydration(Boolean passedHydration) {
        this.passedHydration = passedHydration;
    }

    public Double getBodyFatPercent() {
        return bodyFatPercent;
    }

    public void setBodyFatPercent(Double bodyFatPercent) {
        this.bodyFatPercent = bodyFatPercent;
    }

    public String getSkinfoldAbdominal() {
        return skinfoldAbdominal;
    }

    public void setSkinfoldAbdominal(String skinfoldAbdominal) {
        this.skinfoldAbdominal = skinfoldAbdominal;
    }

    public String getSkinfoldSubscapula() {
        return skinfoldSubscapula;
    }

    public void setSkinfoldSubscapula(String skinfoldSubscapula) {
        this.skinfoldSubscapula = skinfoldSubscapula;
    }

    public String getSkinfoldThigh() {
        return skinfoldThigh;
    }

    public void setSkinfoldThigh(String skinfoldThigh) {
        this.skinfoldThigh = skinfoldThigh;
    }

    public String getSkinfoldCalf() {
        return skinfoldCalf;
    }

    public void setSkinfoldCalf(String skinfoldCalf) {
        this.skinfoldCalf = skinfoldCalf;
    }

    public String getSkinfoldBicep() {
        return skinfoldBicep;
    }

    public void setSkinfoldBicep(String skinfoldBicep) {
        this.skinfoldBicep = skinfoldBicep;
    }

    public String getSkinfoldTricep() {
        return skinfoldTricep;
    }

    public void setSkinfoldTricep(String skinfoldTricep) {
        this.skinfoldTricep = skinfoldTricep;
    }

    public String getSkinfoldSupraspinale() {
        return skinfoldSupraspinale;
    }

    public void setSkinfoldSupraspinale(String skinfoldSupraspinale) {
        this.skinfoldSupraspinale = skinfoldSupraspinale;
    }

    public Integer getAssessorId() {
        return assessorId;
    }

    public void setAssessorId(Integer assessorId) {
        this.assessorId = assessorId;
    }

    public Integer getHydrationAssessor() {
        return hydrationAssessor;
    }

    public void setHydrationAssessor(Integer hydrationAssessor) {
        this.hydrationAssessor = hydrationAssessor;
    }

    public Integer getGoverningBodyId() {
        return governingBodyId;
    }

    public void setGoverningBodyId(Integer governingBodyId) {
        this.governingBodyId = governingBodyId;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
