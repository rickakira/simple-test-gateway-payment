package com.demo.test.ipag.response.dto;


import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonRootName("pix")
public class PixDto {

    private String link;
    private String qrcode;

}
