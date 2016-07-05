package org.boutwaretech.weightspec.domain;

import lombok.Data;

@Data
public class Team {
    private Long id;
    private String name;
    private String city;
    private String state;
    private Long orgId;
    
    public Team() {
        this(null, null, null, null, null);
    }
    
    public Team(Long id, String name, String city, String state, Long orgId) {
        if (id == null) {
            id = (long)(Math.random() * 999999 + 1);
        }
        if (orgId == null) {
            orgId = (long)(Math.random() * 999999 + 1);
        }
        this.id = id;
        this.name = name;
        this.city = city;
        this.state = state;
        this.orgId = orgId;
    }
}
