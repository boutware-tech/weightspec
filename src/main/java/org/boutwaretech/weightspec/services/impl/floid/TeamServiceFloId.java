package org.boutwaretech.weightspec.services.impl.floid;

import org.boutwaretech.weightspec.configuration.Profiles;
import org.boutwaretech.weightspec.domain.BodyMeasurementTransaction;
import org.boutwaretech.weightspec.domain.Person;
import org.boutwaretech.weightspec.domain.Team;
import org.boutwaretech.weightspec.domain.floid.FloIdCollectionBaseDTO;
import org.boutwaretech.weightspec.domain.floid.FloIdTeam;
import org.boutwaretech.weightspec.services.iface.TeamService;
import org.springframework.context.annotation.Profile;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Profile(Profiles.FLOID_TEAMSVC)
@Service
public class TeamServiceFloId implements TeamService<FloIdTeam> {

    @Override
    public Iterable<FloIdTeam> listAllTeams() {
        String url = "https://blu8mpte03.execute-api.us-west-2.amazonaws.com/v1/teams";
        ParameterizedTypeReference<FloIdCollectionBaseDTO<FloIdTeam>> typeRef = 
                new ParameterizedTypeReference<FloIdCollectionBaseDTO<FloIdTeam>>() {};
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<FloIdCollectionBaseDTO<FloIdTeam>> response = 
                restTemplate.exchange(url, HttpMethod.GET, null, typeRef);
        FloIdCollectionBaseDTO<FloIdTeam> baseDTO = response.getBody();
        return baseDTO.getData();
    }

    @Override
    public Team getTeam(String teamId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterable<Person> getAthletesByTeam(String teamId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterable<BodyMeasurementTransaction> getTransactionsByTeam(String teamId) {
        // TODO Auto-generated method stub
        return null;
    }

}
