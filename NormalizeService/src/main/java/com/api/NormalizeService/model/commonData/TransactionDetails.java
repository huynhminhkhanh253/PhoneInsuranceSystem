package com.api.NormalizeService.model.commonData;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class TransactionDetails  {
    private String transactionId;
    private String purchaseDate;
    private String status;
    private String paymentMethod;
    private double amount;
    private String currency;
}
