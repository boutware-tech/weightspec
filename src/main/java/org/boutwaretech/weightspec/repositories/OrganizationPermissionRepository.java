package org.boutwaretech.weightspec.repositories;

import org.boutwaretech.weightspec.domain.OrganizationPermission;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "orgpermissions", path = "orgpermissions")
public interface OrganizationPermissionRepository extends PagingAndSortingRepository<OrganizationPermission, Long> {

}
