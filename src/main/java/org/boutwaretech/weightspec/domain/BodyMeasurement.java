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

@Entity
public class BodyMeasurement extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

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

    public String getAthleteFirstName() {
        return athleteFirstName;
    }

    public void setAthleteFirstName(String athleteFirstName) {
        this.athleteFirstName = athleteFirstName;
    }

    public String getAthleteLastName() {
        return athleteLastName;
    }

    public void setAthleteLastName(String athleteLastName) {
        this.athleteLastName = athleteLastName;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public WeightUnit getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(WeightUnit weightUnit) {
        this.weightUnit = weightUnit;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public HeightUnit getHeightUnit() {
        return heightUnit;
    }

    public void setHeightUnit(HeightUnit heightUnit) {
        this.heightUnit = heightUnit;
    }

    public Double getSpecificGravity() {
        return specificGravity;
    }

    public void setSpecificGravity(Double specificGravity) {
        this.specificGravity = specificGravity;
    }

    public boolean isPassedHydration() {
        return passedHydration;
    }

    public void setPassedHydration(boolean passedHydration) {
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

    public BodyMeasurementTransaction getTransactionId() {
        return transaction;
    }

    public void setTransactionId(BodyMeasurementTransaction transaction) {
        this.transaction = transaction;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
