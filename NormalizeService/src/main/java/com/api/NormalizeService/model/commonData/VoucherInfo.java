package com.api.NormalizeService.model.commonData;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.UUID;
@Getter
@Setter
@Embeddable
public class VoucherInfo {
    private String voucherCode;
    private UUID voucherId;
    private int discountPercentage;
    private String validUntil;
}
