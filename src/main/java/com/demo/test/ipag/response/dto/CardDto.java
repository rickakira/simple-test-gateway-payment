package com.demo.test.ipag.response.dto;


import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonRootName("card")
public class CardDto {

    private String holder;
    private String number;
    private String expiry_month;
    private String expiry_year;
    private String brand;
    private String token;

}
