package com.api.NormalizeService.model.commonData;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class SellerInfo {
    private long sellerNumber;
    private String sellerName;
    @OneToOne(cascade = CascadeType.ALL)
    private SellerContact sellerContact;
}
