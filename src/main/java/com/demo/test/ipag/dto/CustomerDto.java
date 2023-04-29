package com.demo.test.ipag.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@JsonRootName("customer")
@AllArgsConstructor
public class CustomerDto extends AbstractCustomerDto {

    private String birthdate;
    private String ip;
}
