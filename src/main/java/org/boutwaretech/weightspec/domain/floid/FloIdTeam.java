package org.boutwaretech.weightspec.domain.floid;

import java.util.Map;

import org.boutwaretech.weightspec.domain.Team;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper=true, includeFieldNames=true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FloIdTeam extends Team<FloIdPerson> {

    private Map<String, String> attributes;
    private Map<String, String> links;

    public void setAttributes(Map<String, String> attributes) {
        if (attributes != null && !attributes.isEmpty()) {
            this.attributes = attributes;
            this.setName(attributes.get("name"));
            this.setCity(attributes.get("city"));
            this.setState(attributes.get("state"));
        }
    }
}
