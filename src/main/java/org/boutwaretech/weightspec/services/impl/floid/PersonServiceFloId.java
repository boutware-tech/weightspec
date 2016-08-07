package org.boutwaretech.weightspec.services.impl.floid;

import org.boutwaretech.weightspec.configuration.Profiles;
import org.boutwaretech.weightspec.constants.Constants;
import org.boutwaretech.weightspec.domain.floid.FloIdCollectionBaseDTO;
import org.boutwaretech.weightspec.domain.floid.FloIdPerson;
import org.boutwaretech.weightspec.services.iface.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Profile(Profiles.FLOID_PERSONSVC)
@Service
@PropertySource("classpath:floid.properties")
public class PersonServiceFloId implements PersonService<FloIdPerson> {

    @Autowired
    private Environment env;

    @Override
    public Iterable<FloIdPerson> listAllPersons() {
        String url = env.getProperty(Constants.FLOID_BASEPATH_PROPERTY) + "people";
        ParameterizedTypeReference<FloIdCollectionBaseDTO<FloIdPerson>> typeRef = 
                new ParameterizedTypeReference<FloIdCollectionBaseDTO<FloIdPerson>>() {};
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<FloIdCollectionBaseDTO<FloIdPerson>> response = 
                restTemplate.exchange(url, HttpMethod.GET, null, typeRef);
        FloIdCollectionBaseDTO<FloIdPerson> baseDTO = response.getBody();
        return baseDTO.getData();
    }

    @Override
    public FloIdPerson getPerson(String personId) {
        // TODO Auto-generated method stub
        return null;
    }

}