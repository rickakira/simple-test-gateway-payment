package com.demo.test.ipag.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@JsonRootName("subscription")
public class SubscriptionDto {

    private Integer frequency;
    private String interval;
    private Date start_date;
    private BigDecimal amount;
    private Integer installments;
    private Integer cycles;

    @Getter
    @Setter
    @JsonRootName("trial")
    static class TrialDto {

        private BigDecimal amount;
        private Integer cycles;
        private Integer frequency;
    }
}
