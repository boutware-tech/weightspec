package org.boutwaretech.weightspec.domain.floid;

import java.util.Map;

import org.boutwaretech.weightspec.domain.Team;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FloIdTeam extends Team {

    private String selfLink;

    //@JsonProperty("data")
    //public void setId(Map<String, Object> data) {
    //    this.setId((String) data.get("id"));
    //}

    @JsonProperty("attributes")
    //@SuppressWarnings("unchecked")
    public void setName(Map<String, Object> attributes) {
        //Map<String, Object> attributes = (Map<String, Object>) data.get("attributes");
        if (attributes != null) {
            this.setName((String) attributes.get("name"));
        }
    }

    @JsonProperty("links")
    public void setSelfLink(Map<String, Object> links) {
        selfLink = (String) links.get("self");
    }
}
