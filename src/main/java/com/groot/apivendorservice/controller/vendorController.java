package com.groot.apivendorservice.controller;


import com.groot.apivendorservice.models.vendorModel;
import com.groot.apivendorservice.service.vendorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/vendor")
public class vendorController {

    private final vendorService vendorService;

    @GetMapping("/{vendNumber}")
    public Mono<vendorModel> getVendorNode(@PathVariable String vendNumber) {
        return vendorService.getVendorNode(vendNumber);
    }
}
