package com.demo.test.ipag.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@JsonRootName("boleto")
public class BoletoDto {

    private Date due_date;
    private String provider;
    private List<InstructionDto> instructions;


    @JsonRootName("instructions")
    static class InstructionDto {

        @Getter
        @Setter
        private String instruction;
    }
}
