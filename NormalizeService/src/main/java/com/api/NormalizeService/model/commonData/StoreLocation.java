package com.api.NormalizeService.model.commonData;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "store_location")
public class StoreLocation {
    @Id
    @GeneratedValue
    private long id;
    private String city;
    private String state;
    private long zipCode;
}
