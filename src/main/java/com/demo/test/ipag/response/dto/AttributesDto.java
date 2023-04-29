package com.demo.test.ipag.response.dto;


import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@JsonRootName("attributes")
public class AttributesDto {

    private Integer seller_id;
    private String order_id;
    private BigDecimal amount;
    private Integer installments;
    private String tid;
    private String authorization_id;
    private String method;
    private BigDecimal captured_amount;
    private LocalDateTime captured_at;
    private String url_authentication;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;


}
