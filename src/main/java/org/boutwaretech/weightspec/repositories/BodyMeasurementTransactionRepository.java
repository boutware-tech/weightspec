package org.boutwaretech.weightspec.repositories;

import org.boutwaretech.weightspec.domain.BodyMeasurementTransaction;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "transactions", path = "transactions")
public interface BodyMeasurementTransactionRepository extends PagingAndSortingRepository<BodyMeasurementTransaction, Long> {

}
