package com.demo.test.ipag.response.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@JsonRootName("split_rules")
public class SplitRulesDto {

    private Integer id;
    private String resource;
    private String seller_id;
    private AttributesDto attributes;

    @Getter
    @Setter
    @JsonRootName("attributes")
    static class AttributesDto {

        private String receiver_id;
        private BigDecimal percentage;
        private BigDecimal amount;
        private Boolean liable;
        private Boolean charge_processing_fee;
        private LocalDateTime created_at;
        private LocalDateTime updated_at;

    }
}
