package org.boutwaretech.weightspec.domain;

import lombok.Data;

@Data
public class Athlete {
    private Long id;
    private String firstName;
    private String lastName;
    private String dob;
    private String gender;
    private Long teamId;
    
    public Athlete() {
        this(null, null, null, null, null, null);
    }
    
    public Athlete(Long id, String firstName, String lastName, String dob, String gender, Long teamId) {
        if (id == null) {
            id = (long)(Math.random() * 999999 + 1);
        }
        if (teamId == null) {
            teamId = (long)(Math.random() * 999999 + 1);
        }
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.teamId = teamId;
    }
}
