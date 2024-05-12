package com.api.NormalizeService.model.PartnerMessage;

import com.api.NormalizeService.model.commonData.CommonMessage;
import com.api.NormalizeService.model.commonData.StoreLocation;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "partner_message")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@XmlRootElement(name = "PartnerData")
public class PartnerMessage extends CommonMessage {
    @Id
    @GeneratedValue
    private long id;
    @XmlElement
    private PartnerData partnerData;
}
