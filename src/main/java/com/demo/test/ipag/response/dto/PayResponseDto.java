package com.demo.test.ipag.response.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PayResponseDto {

    private Integer id;
    private String uuid;
    private String resource;
    private AttributesDto attributes;
    private StatusDto status;
    private AcquirerDto acquirer;
    private BoletoDto boleto;
    private PixDto pix;
    private CardDto card;
    private CustomerDto customer;
    private SubscriptionDto subscription;
    private ProductsDto products;
    private AntiFraudDto antiFraud;
    private List<SplitRulesDto> splitRules;
    private List<ReceivablesDto> receivables;
    private List<HistoryDto> history;

}
