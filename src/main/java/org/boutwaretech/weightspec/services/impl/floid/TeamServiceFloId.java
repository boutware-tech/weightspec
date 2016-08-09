package org.boutwaretech.weightspec.services.impl.floid;

import javax.annotation.PostConstruct;

import org.boutwaretech.weightspec.configuration.Profiles;
import org.boutwaretech.weightspec.constants.Constants;
import org.boutwaretech.weightspec.domain.BodyMeasurementTransaction;
import org.boutwaretech.weightspec.domain.floid.FloIdBaseDTO;
import org.boutwaretech.weightspec.domain.floid.FloIdCollectionBaseDTO;
import org.boutwaretech.weightspec.domain.floid.FloIdPerson;
import org.boutwaretech.weightspec.domain.floid.FloIdTeam;
import org.boutwaretech.weightspec.services.iface.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Profile({Profiles.FLOID_TEAMSVC, Profiles.FLOID_SVCS})
@Service
@PropertySource("classpath:floid.properties")
public class TeamServiceFloId implements TeamService<FloIdTeam> {

    private String floidBasepath;
    
    @Autowired
    private Environment env;
    
    @PostConstruct
    public void setFloidBasepath() {
        this.floidBasepath = env.getProperty(Constants.FLOID_BASEPATH_PROPERTY);
    }

    @Override
    public Iterable<FloIdTeam> listAllTeams() {
        String url = this.floidBasepath + "teams";
        ParameterizedTypeReference<FloIdCollectionBaseDTO<FloIdTeam>> typeRef = 
                new ParameterizedTypeReference<FloIdCollectionBaseDTO<FloIdTeam>>() {};
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<FloIdCollectionBaseDTO<FloIdTeam>> response = 
                restTemplate.exchange(url, HttpMethod.GET, null, typeRef);
        FloIdCollectionBaseDTO<FloIdTeam> baseDTO = response.getBody();
        return baseDTO.getData();
    }

    @Override
    public FloIdTeam getTeam(String teamId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public FloIdTeam getTeamWithAthletes(String teamId) {
        String url = this.floidBasepath + "teams/" + teamId + "?include=athletes";
        ParameterizedTypeReference<FloIdBaseDTO<FloIdTeam, FloIdPerson>> typeRef =
                new ParameterizedTypeReference<FloIdBaseDTO<FloIdTeam, FloIdPerson>>() {};
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<FloIdBaseDTO<FloIdTeam, FloIdPerson>> response =
                restTemplate.exchange(url, HttpMethod.GET, null, typeRef);
        FloIdBaseDTO<FloIdTeam, FloIdPerson> baseDTO = response.getBody();
        FloIdTeam team = baseDTO.getData();
        team.setAthletes(baseDTO.getIncluded());
        return team;
    }

    @Override
    public Iterable<BodyMeasurementTransaction> getTransactionsByTeam(String teamId) {
        // TODO Auto-generated method stub
        return null;
    }

}
