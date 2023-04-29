package com.demo.test.ipag.response.dto;


import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@JsonRootName("history")
public class HistoryDto {

    private BigDecimal amount;
    private String type;
    private String status;
    private String response_code;
    // field below is described like this in the documentation {@Link https://developers.ipag.com.br/pt-br/payment?id=criar-pagamento}
    private String response_menssage;
    private String authorization_code;
    private String authorization_id;
    private String authorization_nsu;
    private LocalDateTime created_at;

}
