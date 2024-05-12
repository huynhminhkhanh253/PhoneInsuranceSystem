package com.api.NormalizeService.model.PartnerMessage;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class PartnerInfo {
    private long partnerId;
    @OneToOne(cascade = CascadeType.ALL)
    private PartnerLocation partnerLocation;

}
