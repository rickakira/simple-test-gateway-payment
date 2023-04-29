package com.demo.test.ipag.response.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonRootName("antifraud")
public class AntiFraudDto {

    private Integer score;
    private String status;
    private String message;

}
