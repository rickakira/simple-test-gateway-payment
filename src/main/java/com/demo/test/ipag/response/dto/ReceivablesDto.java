package com.demo.test.ipag.response.dto;


import com.demo.test.ipag.enums.StatusEnum;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@JsonRootName("receivables")
public class ReceivablesDto {

    private Integer id;
    private String resource;
    private List<AttributesDto> attributes;


    @Getter
    @Setter
    @JsonRootName("attributes")
    static class AttributesDto {

        private String receiver_id;
        private String receiver_uuid;
        private String transaction;
        private StatusEnum status;
        private BigDecimal ammount;
        private BigDecimal gross_amount;
        private Integer installment;
        private String description;
        private LocalDateTime paid_at;
        private LocalDateTime canceled_at;
        private LocalDateTime expected_on;
        private LocalDateTime created_at;
        private LocalDateTime updated_at;

    }
}
