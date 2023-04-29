package com.demo.test.ipag.dto;


import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@JsonRootName("parameters")
public class ParametersPaymentDto {

    private BigDecimal amount;
    private String order_id;
    private String callback_url;
    private AntiFraudDto antifraud;
    private PaymentDto payment;
    private CustomerDto customer;
    private SubscriptionDto subscription;


}
