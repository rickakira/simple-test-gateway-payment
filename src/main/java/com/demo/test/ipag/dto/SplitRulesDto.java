package com.demo.test.ipag.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@JsonRootName("split_rules")
public class SplitRulesDto {

    private String seller_id;
    private BigDecimal percentage;
    private BigDecimal amount;
    private Boolean liable;
    private Boolean charge_processing_fee;
    private Boolean hold_receivables;
}
