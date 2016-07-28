package org.boutwaretech.weightspec.domain.floid;

import java.util.Map;

import org.boutwaretech.weightspec.domain.Person;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper=true, includeFieldNames=true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FloIdPerson extends Person {
    
    private Map<String, String> attributes;
    private Map<String, String> links;

    public void setAttributes(Map<String, String> attributes) {
        if (attributes != null && !attributes.isEmpty()) {
            this.attributes = attributes;
            this.setFirstName(attributes.get("firstName"));
            this.setLastName(attributes.get("lastName"));
            this.setGender(attributes.get("gender"));
            this.setDateOfBirth(attributes.get("dateOfBirth"));
        }
    }
}
