package com.demo.test.ipag.response.dto;


import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonRootName("acquirer")
public class AcquirerDto {

    private String name;
    private String message;
    private String code;
    private String merchant_id;

}
