package com.api.NormalizeService.model.commonData;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class CommonMessage {
    private String phoneModel;
    private String purchaseType;
    private String eventType;
    private BuyerInfo buyerInfo;
    private SellerInfo sellerInfo;
    private Specs specs;
    private TransactionDetails transactionDetails;
    private VoucherInfo voucherInfo;
}
