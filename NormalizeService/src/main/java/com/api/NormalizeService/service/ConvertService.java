package com.api.NormalizeService.service;

import com.api.NormalizeService.model.GuaranteeEvent;
import com.api.NormalizeService.model.OnlineMessages.OnlineMessage;
import com.api.NormalizeService.model.commonData.CommonMessage;
import org.springframework.stereotype.Service;

@Service
public class ConvertService {

    public GuaranteeEvent convertToGuaranteeEvent(CommonMessage commonMessage){
        GuaranteeEvent.GuaranteeEventBuilder builder = GuaranteeEvent.builder();
        setCommonData(builder, commonMessage);
        if(commonMessage instanceof OnlineMessage){
            builder.price(((OnlineMessage) commonMessage).getOnlineData().getPrice())
                    .historyID(((OnlineMessage) commonMessage).getOnlineData().getHistoryID())
                    .Channel(((OnlineMessage) commonMessage).getOnlineData().getChannel());
        }
        return builder.build();
    }
    public void setCommonData(GuaranteeEvent.GuaranteeEventBuilder builder, CommonMessage commonMessage){
        builder.phoneModel(commonMessage.getPhoneModel())
                .purchaseType(commonMessage.getPurchaseType())
                .eventType(commonMessage.getEventType())
                .buyerNumber(commonMessage.getBuyerInfo().getBuyerNumber())
                .buyerName(commonMessage.getBuyerInfo().getBuyerName())
                .buyerEmail(commonMessage.getBuyerInfo().getBuyerContact().getEmail())
                .buyerPhone(commonMessage.getBuyerInfo().getBuyerContact().getPhone())
                .buyerStreet(commonMessage.getBuyerInfo().getBillingAddress().getStreet())
                .buyerCity(commonMessage.getBuyerInfo().getBillingAddress().getCity())
                .buyerState(commonMessage.getBuyerInfo().getBillingAddress().getState())
                .buyerZipCode(commonMessage.getBuyerInfo().getBillingAddress().getZipCode())
                .sellerNumber(commonMessage.getSellerInfo().getSellerNumber())
                .sellerName(commonMessage.getSellerInfo().getSellerName())
                .sellerEmail(commonMessage.getSellerInfo().getSellerContact().getEmail())
                .sellerPhone(commonMessage.getSellerInfo().getSellerContact().getPhone())
                .screenSize(commonMessage.getSpecs().getScreenSize())
                .ram(commonMessage.getSpecs().getRam())
                .cpu(commonMessage.getSpecs().getCpu())
                .storage(commonMessage.getSpecs().getStorage())
                .cameraMain(commonMessage.getSpecs().getCamera().getMain())
                .cameraFront(commonMessage.getSpecs().getCamera().getFront())
                .battery(commonMessage.getSpecs().getBattery())
                .transactionId(commonMessage.getTransactionDetails().getTransactionId())
                .purchaseDate(commonMessage.getTransactionDetails().getPurchaseDate())
                .status(commonMessage.getTransactionDetails().getStatus())
                .paymentMethod(commonMessage.getTransactionDetails().getPaymentMethod())
                .amount(commonMessage.getTransactionDetails().getAmount())
                .currency(commonMessage.getTransactionDetails().getCurrency())
                .voucherCode(commonMessage.getVoucherInfo().getVoucherCode())
                .voucherId(commonMessage.getVoucherInfo().getVoucherId())
                .discountPercentage(commonMessage.getVoucherInfo().getDiscountPercentage())
                .validUntil(commonMessage.getVoucherInfo().getValidUntil());
    }
}
