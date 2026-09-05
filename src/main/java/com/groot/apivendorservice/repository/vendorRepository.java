package com.groot.apivendorservice.repository;


import com.groot.apivendorservice.models.vendorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Repository
public interface vendorRepository extends R2dbcRepository<vendorModel, String> {
    Mono<vendorModel> findByVendorNumber(String vendorNumber);
}
