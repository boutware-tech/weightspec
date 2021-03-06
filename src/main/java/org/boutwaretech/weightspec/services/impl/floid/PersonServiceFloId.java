package org.boutwaretech.weightspec.services.impl.floid;

import org.boutwaretech.weightspec.configuration.Profiles;
import org.boutwaretech.weightspec.domain.floid.FloIdCollectionBaseDTO;
import org.boutwaretech.weightspec.domain.floid.FloIdPerson;
import org.boutwaretech.weightspec.services.iface.PersonService;
import org.springframework.context.annotation.Profile;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Profile({Profiles.FLOID_PERSONSVC, Profiles.FLOID_SVCS})
@Service
public class PersonServiceFloId extends BaseServiceFloId implements PersonService<FloIdPerson> {

    @Override
    public Iterable<FloIdPerson> listAllPersons() {
        String url = this.floidBasepath + "people";
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
