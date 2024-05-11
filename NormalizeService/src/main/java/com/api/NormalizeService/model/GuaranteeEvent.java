package com.api.NormalizeService.model;

import lombok.*;
import org.apache.camel.language.bean.Bean;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Builder
public class GuaranteeEvent {
    private String phoneModel;
    private String purchaseType;
    private String eventType;
    private long buyerNumber;
    private String buyerName;
    private String buyerEmail;
    private String buyerPhone;
    private String buyerStreet;
    private String buyerCity;
    private String buyerState;
    private long buyerZipCode;
    private long sellerNumber;
    private String sellerName;
    private String sellerEmail;
    private String sellerPhone;
    private double price;
    private UUID historyID;
    private String Channel;
    private String storeName;
    private String storeId;
    private String partnerName;
    private String exclusiveOffer;
    private double screenSize;
    private String ram;
    private String cpu;
    private String storage;
    private String cameraMain;
    private String cameraFront;
    private String battery;
    private String transactionId;
    private String purchaseDate;
    private String status;
    private String paymentMethod;
    private double amount;
    private String currency;
    private String inStoreExperience;
    private String voucherCode;
    private UUID voucherId;
    private int discountPercentage;
    private String validUntil;
}
