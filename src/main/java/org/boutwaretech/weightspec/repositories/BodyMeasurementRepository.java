package org.boutwaretech.weightspec.repositories;

import org.boutwaretech.weightspec.domain.BodyMeasurement;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "measurements", path = "measurements")
public interface BodyMeasurementRepository extends  PagingAndSortingRepository<BodyMeasurement, Integer> {

}
