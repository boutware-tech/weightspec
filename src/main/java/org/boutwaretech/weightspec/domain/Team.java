package org.boutwaretech.weightspec.domain;

import lombok.Data;

@Data
public class Team<P extends Person> {
    private String id;
    private String name;
    private String city;
    private String state;
    private String orgId;
    private Iterable<P> athletes;
    
    public Team() {
        this(null, null, null, null, null);
    }
    
    public Team(String id, String name, String city, String state, String orgId) {
        if (id == null) {
            id = ((Double)(Math.random() * 999999 + 1)).toString();
        }
        if (orgId == null) {
            orgId = ((Double)(Math.random() * 999999 + 1)).toString();
        }
        this.id = id;
        this.name = name;
        this.city = city;
        this.state = state;
        this.orgId = orgId;
    }
}
