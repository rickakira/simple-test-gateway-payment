package com.demo.test.ipag.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonRootName("payment")
public class PaymentDto {

    private String type;
    private String method;
    private String installments;
    private Boolean capture;
    private Boolean fraud_analysis;
    private String softdescriptor;
    private Integer pix_expires_in;
    private CardDto card;
    private BoletoDto boleto;
    private CustomerDto customer;


    @Getter
    @Setter
    @JsonRootName("card")
    static class CardDto {

        private String holder;
        private String number;
        private String expiry_month;
        private String expiry_year;
        private String cvv;
        private String token;
        private Boolean tokenize;
    }


}
