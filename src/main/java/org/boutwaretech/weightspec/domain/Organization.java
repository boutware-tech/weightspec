package org.boutwaretech.weightspec.domain;

import lombok.Data;

@Data
public class Organization {
    private String id;
    private String longName;
    private String shortName;
    
    public Organization() {
        this(null);
    }
    
    public Organization(String id) {
        this.id = id;
    }
}
