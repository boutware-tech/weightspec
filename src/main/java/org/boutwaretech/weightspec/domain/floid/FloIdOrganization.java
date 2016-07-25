package org.boutwaretech.weightspec.domain.floid;

import java.util.Map;

import org.boutwaretech.weightspec.domain.Organization;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper=true, includeFieldNames=true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FloIdOrganization extends Organization {
    
    private Map<String, String> attributes;
    private Map<String, String> links;
    
    public void setAttributes(Map<String, String> attributes) {
        if (attributes != null && !attributes.isEmpty()) {
            this.attributes = attributes;
            setLongName(attributes.get("longName"));
            setShortName(attributes.get("shortName"));
        }
    }
}
