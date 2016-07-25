package org.boutwaretech.weightspec.services.iface;

import org.boutwaretech.weightspec.domain.Organization;

public interface OrganizationService<O extends Organization> {
    
    Iterable<O> listAllOrganizations();
    
    O getOrganization(String orgId);
}
