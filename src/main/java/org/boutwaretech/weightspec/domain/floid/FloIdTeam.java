package org.boutwaretech.weightspec.domain.floid;

import java.util.Map;

import org.boutwaretech.weightspec.domain.Team;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper=true, includeFieldNames=true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FloIdTeam extends Team {

    private String selfLink;

    @JsonProperty("attributes")
    public void setName(Map<String, Object> attributes) {
        if (attributes != null) {
            this.setName((String) attributes.get("name"));
        }
    }

    @JsonProperty("links")
    public void setSelfLink(Map<String, Object> links) {
        selfLink = (String) links.get("self");
    }
}
