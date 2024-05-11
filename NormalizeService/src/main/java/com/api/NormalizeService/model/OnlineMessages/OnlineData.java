package com.api.NormalizeService.model.OnlineMessages;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@Embeddable
public class OnlineData  {
    private double price;
    private UUID historyID;
    private String Channel;
}
