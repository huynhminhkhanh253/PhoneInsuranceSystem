package com.api.NormalizeService.model.PartnerMessage;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "partner_location")
public class PartnerLocation {
    @Id
    @GeneratedValue
    private long Id;

    private String city;
    private String state;
    private long zipCode;
}
