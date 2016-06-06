package org.boutwaretech.weightspec.repositories;

import org.boutwaretech.weightspec.domain.BodyMeasurementApproval;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "approvals", path = "approvals")
public interface BodyMeasurementApprovalRepository extends PagingAndSortingRepository<BodyMeasurementApproval, Integer> {

}
