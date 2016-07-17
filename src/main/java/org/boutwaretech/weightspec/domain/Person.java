package org.boutwaretech.weightspec.domain;

import lombok.Data;

@Data
public class Person {
    private String id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String teamId;
    
    public Person() {
        this(null, null, null, null, null, null);
    }
    
    public Person(String id, String firstName, String lastName, String dob, String gender, String teamId) {
        if (id == null) {
            id = ((Double)(Math.random() * 999999 + 1)).toString();
        }
        if (teamId == null) {
            teamId = ((Double)(Math.random() * 999999 + 1)).toString();
        }
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dob;
        this.gender = gender;
        this.teamId = teamId;
    }
}
