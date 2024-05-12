package com.api.NormalizeService.model.PartnerMessage;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class PartnerData {
    private String partnerName;
    private PartnerInfo partnerInfo;
}
