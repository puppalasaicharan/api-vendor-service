package com.groot.apivendorservice.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "vendor-node")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class vendorModel {
    @Id
    @Column("vendorNumber")
    private String vendorNumber;

    @Column( "vendorType")
    private String vendorType;
}
