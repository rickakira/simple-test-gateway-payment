package com.demo.test.ipag.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonRootName("antifraud")
public class AntiFraudDto {

    private String fingerprint;
    private String provider;
}
