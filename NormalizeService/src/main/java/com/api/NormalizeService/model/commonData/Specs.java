package com.api.NormalizeService.model.commonData;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class Specs {
    private double screenSize;
    private String ram;
    private String cpu;
    private String storage;
    private Camera camera;
    private String battery;
}

