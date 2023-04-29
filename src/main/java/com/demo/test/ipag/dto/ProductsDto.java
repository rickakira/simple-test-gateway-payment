package com.demo.test.ipag.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@JsonRootName("products")
public class ProductsDto {

    private String name;
    private String description;
    private BigDecimal unit_price;
    private Integer quantity;
    private String sku;
}
