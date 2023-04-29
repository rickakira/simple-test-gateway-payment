package com.demo.test.ipag.response.dto;


import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@JsonRootName("boleto")
public class BoletoDto {

    private Date due_date;
    private String digitable_line;
    private String link;

}
