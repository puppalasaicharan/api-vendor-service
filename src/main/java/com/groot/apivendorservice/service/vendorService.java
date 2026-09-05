package com.groot.apivendorservice.service;


import com.groot.apivendorservice.models.vendorModel;
import com.groot.apivendorservice.repository.vendorRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class vendorService {
    private final  vendorRepository vendorRepositoryVar;;
    public Mono<vendorModel> getVendorNode(String vendNumber){
            return vendorRepositoryVar.findByVendorNumber(vendNumber);
    }
}
