package org.boutwaretech.weightspec.services.impl.floid;

import org.boutwaretech.weightspec.configuration.Profiles;
import org.boutwaretech.weightspec.domain.floid.FloIdCollectionBaseDTO;
import org.boutwaretech.weightspec.domain.floid.FloIdOrganization;
import org.boutwaretech.weightspec.services.iface.OrganizationService;
import org.springframework.context.annotation.Profile;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Profile({Profiles.FLOID_ORGSVC, Profiles.FLOID_SVCS})
@Service
public class OrganizationServiceFloId extends BaseServiceFloId implements OrganizationService<FloIdOrganization> {

    @Override
    public Iterable<FloIdOrganization> listAllOrganizations() {
        String url = this.floidBasepath + "organizations";
        ParameterizedTypeReference<FloIdCollectionBaseDTO<FloIdOrganization>> typeRef = 
                new ParameterizedTypeReference<FloIdCollectionBaseDTO<FloIdOrganization>>() {};
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<FloIdCollectionBaseDTO<FloIdOrganization>> response = 
                restTemplate.exchange(url, HttpMethod.GET, null, typeRef);
        FloIdCollectionBaseDTO<FloIdOrganization> baseDTO = response.getBody();
        return baseDTO.getData();
    }

    @Override
    public FloIdOrganization getOrganization(String orgId) {
        // TODO Auto-generated method stub
        return null;
    }

}
